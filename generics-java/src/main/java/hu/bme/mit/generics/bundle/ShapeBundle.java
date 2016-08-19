package hu.bme.mit.generics.bundle;

import hu.bme.mit.generics.data.Shape;
import hu.bme.mit.generics.operations.ShapeOperation;

public abstract class ShapeBundle<TShape extends Shape> {

	private TShape shape;
	private ShapeOperation<TShape> factory;

	public ShapeBundle(TShape shape, ShapeOperation<TShape> factory) {
		this.shape = shape;
		this.factory = factory;
	}
	
}
