package hu.bme.mit.generics.bundle;

import hu.bme.mit.generics.data.Rectangle;
import hu.bme.mit.generics.data.Square;
import hu.bme.mit.generics.operations.ShapeOperation;

public class SquareBundle extends RectangleBundle<Square> {

	public SquareBundle(Square shape, ShapeOperation<Rectangle> factory) {
		super(shape, factory);
	}
	
}
