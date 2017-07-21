package org.albaross.agents4j.bdi;

import java.util.Set;

import org.albaross.agents4j.core.common.OperationParam;
import org.albaross.agents4j.core.common.PerceptionOperator;

/**
 * 
 * @author Manuel Barbi
 *
 */
public interface BeliefRevisionOperator<P, B> extends PerceptionOperator<P> {

	@Override
	default <A> void perceive(OperationParam<P, A> param, P perception) {
		Set<B> statements = translate(perception);
		revision(param, statements);
	}

	Set<B> translate(P perception);

	<A> void revision(OperationParam<P, A> param, Set<B> statements);

}
