package com.knoldus

class ShowLongImplementation {
  val longShow=new ShowImplementation[Long] {
    def show(longVariable: Long) = longVariable.toString
  }
}
