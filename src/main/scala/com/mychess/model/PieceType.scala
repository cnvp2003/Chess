package com.mychess.model

import com.mychess.utils.ChessHelper

trait PieceType {
  def currentPosition: ChessPosition
  def possibleMoves:List[ChessPosition]
  private[model] def steps:Int
  private[model] def isAllowed(position: ChessPosition):Boolean

  def getPositions(steps: Int, position: ChessPosition): List[ChessPosition] ={
    var positions = List.empty[ChessPosition]
    var rowStart = position.x-steps
    var rowEnd = position.x + steps
    var colStart = position.y-steps
    var colEnd =  position.y + steps

    if(rowStart <= 0) rowStart = 0
    if(rowEnd > ChessHelper.SIZE) rowEnd = ChessHelper.SIZE
    if(colStart <= 0) colStart = 0
    if(colEnd > ChessHelper.SIZE) colEnd = ChessHelper.SIZE

    for {
      row <- rowStart to rowEnd
      column <- colStart to colEnd
    } yield {
      positions = ChessPosition(row, column) :: positions
    }

    positions
  }

}


/*
object PieceTypes extends Enumeration {
  type PieceType = Value
  val King, Queen, Horse, Bishop, Rook, Pawn = Value
}
*/



