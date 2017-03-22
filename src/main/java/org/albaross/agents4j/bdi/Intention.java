package org.albaross.agents4j.bdi;

public interface Intention<D extends Desire> {

	D satisfies();

}
