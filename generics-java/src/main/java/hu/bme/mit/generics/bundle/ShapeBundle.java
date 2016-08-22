package hu.bme.mit.generics.bundle;

import hu.bme.mit.generics.data.Shape;
import hu.bme.mit.generics.operations.ShapeOperation;

public abstract class ShapeBundle<TShape extends Shape> {

	private TShape shape;
	private ShapeOperation<TShape> operation;

	public ShapeBundle(TShape shape, ShapeOperation<TShape> operation) {
		this.shape = shape;
		this.operation = operation;
	}
	
}
