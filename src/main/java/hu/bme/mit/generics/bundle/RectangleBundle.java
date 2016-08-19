package hu.bme.mit.generics.bundle;

import hu.bme.mit.generics.data.Rectangle;
import hu.bme.mit.generics.operations.ShapeOperation;

public class RectangleBundle<TRectangle extends Rectangle> extends ShapeBundle<TRectangle> {

	public RectangleBundle(TRectangle shape, ShapeOperation<TRectangle> factory) {
		super(shape, factory);
	}
	
}
