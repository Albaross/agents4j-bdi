package org.albaross.agents4j.bdi;

import org.albaross.agents4j.core.common.DataComponent;

/**
 * 
 * @author Manuel Barbi
 *
 */
public interface Beliefs<B> extends DataComponent {

	default boolean reason(B statement) {
		return estimate(statement) == 1;
	}

	double estimate(B statement);

}
