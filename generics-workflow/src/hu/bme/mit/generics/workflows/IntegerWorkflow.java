package hu.bme.mit.generics.workflows;

import java.util.Arrays;
import java.util.Collection;

public class IntegerWorkflow extends AbstractWorkflow<Integer> {

	@Override
	public Collection<Integer> produce() {
		return Arrays.asList(1, 2, 3);
	}

	@Override
	public void consume(final Collection<Integer> elements) {
		System.out.println(elements);
	}

}
