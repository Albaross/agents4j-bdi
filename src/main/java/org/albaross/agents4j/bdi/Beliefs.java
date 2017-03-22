package org.albaross.agents4j.bdi;

import org.albaross.agents4j.core.common.DataComponent;

/**
 * 
 * @author Manuel Barbi
 *
 */
public interface Beliefs<B extends Belief> extends DataComponent {

	boolean reason(B statement);

}
