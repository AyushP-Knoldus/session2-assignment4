package com.knoldus

case class Position(xCoordinate: Int ,yCoordinate: Int )
object Position {
  val showPosition = new ShowImplementation[Position] {
    def show(position: Position) = s"Pos(x: ${position.xCoordinate}, y: ${position.yCoordinate})"
  }
}