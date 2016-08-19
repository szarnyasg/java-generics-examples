package hu.bme.mit.generics.bundle

import hu.bme.mit.generics.data.Rectangle
import hu.bme.mit.generics.operations.ShapeOperation

class RectangleBundle<TRectangle extends Rectangle> extends operation<TRectangle> {
	
	new(TRectangle shape, ShapeOperation<TRectangle> operation) {
		super(shape, operation)
	}
	
}