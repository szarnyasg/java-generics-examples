package hu.bme.mit.generics.bundle;

import hu.bme.mit.generics.data.Shape;
import hu.bme.mit.generics.operations.ShapeOperation;

public abstract class ShapeBundle<TShape extends Shape, TShapeOperation extends ShapeOperation<? super TShape>> {

	private TShape shape;
	private TShapeOperation operation;

	public ShapeBundle(TShape shape, TShapeOperation operation) {
		this.shape = shape;
		this.operation = operation;
	}
	
}
