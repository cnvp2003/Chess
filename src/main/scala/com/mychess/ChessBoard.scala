package com.mychess
import com.mychess.model.ChessPosition

object ChessBoard {
  val SIZE = 7

  def checkValidPosition(coordinate: ChessPosition, position: ChessPosition) = {
    coordinate.x >= 0 && coordinate.x <= 7 && coordinate.y >= 0 && coordinate.y <= SIZE && (position.x != coordinate.x || position.y != coordinate.y)
  }
}
