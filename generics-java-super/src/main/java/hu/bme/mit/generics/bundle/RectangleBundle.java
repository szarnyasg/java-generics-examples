package hu.bme.mit.generics.bundle;

import hu.bme.mit.generics.data.Rectangle;
import hu.bme.mit.generics.operations.ShapeOperation;

public class RectangleBundle<TRectangle extends Rectangle, TRectangleOperation extends ShapeOperation<? super TRectangle>>
		extends ShapeBundle<TRectangle, TRectangleOperation> {

	public RectangleBundle(TRectangle shape, TRectangleOperation operation) {
		super(shape, operation);
	}

}
