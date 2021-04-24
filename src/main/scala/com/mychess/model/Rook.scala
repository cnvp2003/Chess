package com.mychess.model

import com.mychess.utils.ChessHelper

case class Rook(currentPosition: ChessPosition) extends PieceType {

  override def steps: Int = 7
  override def isAllowed(position: ChessPosition): Boolean =
    currentPosition.x == position.x || currentPosition.y == position.y

  override def possibleMoves: List[ChessPosition] = {
    getPositions(steps, currentPosition).filter(
      p => ChessHelper.checkValidMove(p, currentPosition) && isAllowed(p)
    )
  }
}