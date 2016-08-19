package hu.bme.mit.generics.workflows;

import java.util.Collection;

public abstract class AbstractWorkflow<T> {

	public abstract Collection<T> produce();
	
	public abstract void consume(Collection<T> elements);	
	
}
