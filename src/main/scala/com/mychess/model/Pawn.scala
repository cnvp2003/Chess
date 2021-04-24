package com.mychess.model

import com.mychess.utils.ChessHelper

case class Pawn(currentPosition: ChessPosition) extends PieceType {

  override def steps: Int = 1
  override def isAllowed(position: ChessPosition): Boolean ={
    //(currentPosition.y == position.y && currentPosition.y - position.y == 1) || currentPosition.x - position.x == 1

    /* Assumption: Assume that the board is empty. This means that the pawn cannot move diagonally.*/
    (currentPosition.y == position.y && currentPosition.x - position.x == 1)
  }

  override def possibleMoves: List[ChessPosition] =
    getPositions(steps, currentPosition).filter(
      p => ChessHelper.checkValidMove(p, currentPosition) && isAllowed(p)
    )
}
