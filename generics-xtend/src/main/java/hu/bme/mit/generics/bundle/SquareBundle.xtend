package hu.bme.mit.generics.bundle

import hu.bme.mit.generics.data.Square
import hu.bme.mit.generics.operations.RectangleOperation

class SquareBundle extends operation<Square> {
	
	new(Square shape, RectangleOperation operation) {
		super(shape, operation)
	}
	
}