package com.mychess.utils
import com.mychess.model.ChessPosition

object ChessHelper {
  val SIZE = 7 //Default Constant for chess board

  def checkCoordinates(coordinate: ChessPosition):Boolean =
    coordinate.x >= 0 && coordinate.x <= SIZE && coordinate.y >= 0 && coordinate.y <= SIZE

  def checkValidMove(p: ChessPosition, currentPosition: ChessPosition): Boolean ={
    ChessHelper.checkCoordinates(currentPosition) match{
      case true => ChessHelper.checkCoordinates(p) && (p.x != currentPosition.x || p.y != currentPosition.y)
      case _ => //println(s"Not valid")
        false
    }
  }

}
