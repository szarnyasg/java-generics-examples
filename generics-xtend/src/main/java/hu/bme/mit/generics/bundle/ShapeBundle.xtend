package hu.bme.mit.generics.bundle

import hu.bme.mit.generics.data.Shape
import hu.bme.mit.generics.operations.ShapeOperation

abstract class ShapeBundle<TShape extends Shape> {
	
	private TShape shape;
	private ShapeOperation<TShape> factory;

	new (TShape shape, ShapeOperation<TShape> factory) {
		this.shape = shape;
		this.factory = factory;
	}
}