package com.knoldus

class ShowDoubleImplementation {
  val doubleShow = new ShowImplementation[Double] {
    def show(doubleVariable: Double) = doubleVariable.toString
  }
}