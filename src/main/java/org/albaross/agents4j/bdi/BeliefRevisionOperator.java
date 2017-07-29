package org.albaross.agents4j.bdi;

import java.util.Set;

import org.albaross.agents4j.core.common.OperationParam;
import org.albaross.agents4j.core.common.Operator;

/**
 * 
 * @author Manuel Barbi
 *
 */
public interface BeliefRevisionOperator<P, A, B> extends Operator<P, A> {

	@Override
	default void process(OperationParam<P, A> param) {
		P perception = param.getPerception();
		Set<B> statements = translate(perception);
		revision(param, statements);
	}

	Set<B> translate(P perception);

	void revision(OperationParam<P, A> param, Set<B> statements);

}
