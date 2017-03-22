package org.albaross.agents4j.bdi;

import java.util.Set;

import org.albaross.agents4j.core.common.DataComponent;

/**
 * 
 * @author Manuel Barbi
 *
 */
public interface Desires extends DataComponent {

	void add(Desire... desires);

	Set<Desire> getDesires();

	void clear();

}
