package hu.bme.mit.generics.handlers;

import java.util.Collection;

import hu.bme.mit.generics.workflows.AbstractWorkflow;

public class GenericWorkflowHandler<T> {

	protected final AbstractWorkflow<T> workflow;
	
	public GenericWorkflowHandler(final AbstractWorkflow<T> workflow) {
		this.workflow = workflow;
	}
	
	public void produce() {
		workflow.produce();
	}

	public void consume(Collection<T> elements) {
		workflow.consume(elements);
	}
	
}
