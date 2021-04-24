package com.mychess.model

import com.mychess.utils.ChessHelper

case class Horse(currentPosition: ChessPosition) extends PieceType {

  override def steps: Int = 2
  override def isAllowed(position: ChessPosition): Boolean =
    (Math.abs(currentPosition.x - position.x) == 2 && Math.abs(
      currentPosition.y - position.y
    ) == 1) ||
      (Math.abs(currentPosition.x - position.x) == 1 && Math.abs(
        currentPosition.y - position.y
      ) == 2)

  override def possibleMoves: List[ChessPosition] = {
    getPositions(steps, currentPosition).filter(
      p => ChessHelper.checkValidMove(p, currentPosition) && isAllowed(p)
    )
  }
}
