package hu.bme.mit.generics.bundle;

import hu.bme.mit.generics.data.Square;
import hu.bme.mit.generics.operations.RectangleOperation;

public class SquareBundle extends RectangleBundle<Square> {

	public SquareBundle(Square shape, RectangleOperation factory) {
		super(shape, factory);
	}
	
}
