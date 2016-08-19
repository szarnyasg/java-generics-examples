package hu.bme.mit.generics.operations;

import hu.bme.mit.generics.data.Shape;

public abstract class ShapeOperation<TShape extends Shape> {

	public abstract void doOperation(TShape shape);
	
}
