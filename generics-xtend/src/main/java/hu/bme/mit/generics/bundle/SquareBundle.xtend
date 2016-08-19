package hu.bme.mit.generics.bundle

import hu.bme.mit.generics.data.Square
import hu.bme.mit.generics.operations.ShapeOperation
import hu.bme.mit.generics.data.Rectangle

class SquareBundle extends ShapeBundle<Square> {
	
	new(Square shape, ShapeOperation<Rectangle> factory) {
		super(shape, factory)
	}
	
}