package hu.bme.mit.generics.bundle;

import hu.bme.mit.generics.data.Square;
import hu.bme.mit.generics.operations.RectangleOperation;

public class SquareBundle extends RectangleBundle<Square, RectangleOperation> {

	public SquareBundle(Square shape, RectangleOperation operation) {
//	public SquareBundle(Square shape, GenericRectangleOperation<Square> operation) {
		super(shape, operation);
	}
	
}
