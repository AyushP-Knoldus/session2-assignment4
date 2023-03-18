package com.knoldus
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
class ShowImplementationTest extends AnyFlatSpec with Matchers{
  "longShow" should "convert long to String" in {
    val showLongImplementationObject = new ShowLongImplementation()
    assert(showLongImplementationObject.longShow.show(2234553646334L) == "2234553646334")
  }
  "doubleShow" should "convert double to String" in {
    val showDoubleImplementationObject = new ShowDoubleImplementation()
    assert(showDoubleImplementationObject.doubleShow.show(34.56) == "34.56")
  }
  "Position" should "convert Position caseclass type to String" in {
    assert(Position.showPosition.show(Position(0,1)) == "Pos(x: 0, y: 1)")
  }
}
