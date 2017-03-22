package org.albaross.agents4j.bdi;

import java.util.Set;

import org.albaross.agents4j.core.Perception;
import org.albaross.agents4j.core.common.OperationParam;
import org.albaross.agents4j.core.common.PerceptionOperator;

/**
 * 
 * @author Manuel Barbi
 *
 */
public interface BeliefRevisionOperator<P extends Perception, B extends Belief> extends PerceptionOperator<P> {

	@Override
	default void perceive(OperationParam param, P perception) {
		Set<B> statements = translate(perception);
		revision(param, statements);
	}

	Set<B> translate(P perception);

	void revision(OperationParam param, Set<B> statements);

}
