package hu.bme.mit.generics.bundle

import hu.bme.mit.generics.data.Shape
import hu.bme.mit.generics.operations.ShapeOperation

abstract class operation<TShape extends Shape> {
	
	private TShape shape;
	private ShapeOperation<TShape> operation;

	new (TShape shape, ShapeOperation<TShape> operation) {
		this.shape = shape;
		this.operation = operation;
	}
}