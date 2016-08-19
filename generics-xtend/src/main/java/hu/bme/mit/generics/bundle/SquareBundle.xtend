package hu.bme.mit.generics.bundle

import hu.bme.mit.generics.data.Square
import hu.bme.mit.generics.operations.GenericRectangleOperation

class SquareBundle extends operation<Square> {

//	new(Square shape, RectangleOperation operation) {
	new(Square shape, GenericRectangleOperation<Square> operation) {
		super(shape, operation)
	}

}
