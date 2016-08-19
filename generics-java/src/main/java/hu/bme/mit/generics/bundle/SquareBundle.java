package hu.bme.mit.generics.bundle;

import hu.bme.mit.generics.data.Square;
import hu.bme.mit.generics.operations.GenericRectangleOperation;

public class SquareBundle extends RectangleBundle<Square> {

	//public SquareBundle(Square shape, RectangleOperation factory) {
	public SquareBundle(Square shape, GenericRectangleOperation<Square> factory) {
		super(shape, factory);
	}
	
}
