package org.albaross.agents4j.bdi;

import java.util.HashSet;
import java.util.Set;

import org.albaross.agents4j.core.common.DataComponent;
import org.albaross.agents4j.core.common.OperationParam;
import org.albaross.agents4j.core.common.Operator;

@FunctionalInterface
public interface DeterminationOperator extends Operator {

	@Override
	default void process(OperationParam param) {
		Desires desires = param.getComponent(Desires.class);
		Intentions intentions = param.getComponent(Intentions.class);

		Desire intention = choose(param, desires.getDesires());

		if (intention != null)
			intentions.add(intention);
	}

	Desire choose(OperationParam param, Set<Desire> desires);

	@Override
	default Set<Class<? extends DataComponent>> getRequired() {
		Set<Class<? extends DataComponent>> required = new HashSet<>();
		required.add(Desires.class);
		required.add(Intentions.class);
		return required;
	}

}
