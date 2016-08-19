package hu.bme.mit.generics.operations

import hu.bme.mit.generics.data.Shape

abstract class ShapeOperation<TShape extends Shape> {

	def abstract void doOperation(TShape shape)

}
