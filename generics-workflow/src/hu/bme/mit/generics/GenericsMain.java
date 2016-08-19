package hu.bme.mit.generics;

import java.util.Arrays;
import java.util.Collection;

import hu.bme.mit.generics.handlers.GenericWorkflowHandler;
import hu.bme.mit.generics.workflows.AbstractWorkflow;
import hu.bme.mit.generics.workflows.IntegerWorkflow;

public class GenericsMain {

	public static void main(final String[] args) {
		final AbstractWorkflow<Integer> workflow = new IntegerWorkflow();
		executeAbstractWorkflow(workflow);

		final GenericWorkflowHandler<Integer> handler = new GenericWorkflowHandler<>(workflow);
		handler.produce();
		handler.consume(Arrays.asList(4, 5, 6));
	}

	private static <T> void executeAbstractWorkflow(final AbstractWorkflow<T> workflow) {
		final Collection<T> elements = workflow.produce();

		workflow.consume(elements);
	}

}
