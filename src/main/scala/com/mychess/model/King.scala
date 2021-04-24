package com.mychess.model

import com.mychess.utils.ChessHelper

case class King(currentPosition: ChessPosition) extends PieceType {

    /*override def possibleMoves: List[ChessPosition] = List(
    ChessPosition(position.x - 1, position.y - 1),
    ChessPosition(position.x - 1, position.y),
    ChessPosition(position.x - 1, position.y + 1),
    ChessPosition(position.x, position.y - 1),
    ChessPosition(position.x, position.y + 1),
    ChessPosition(position.x + 1, position.y - 1),
    ChessPosition(position.x + 1, position.y),
    ChessPosition(position.x + 1, position.y + 1)
  ).filter(p=> ChessBoard.checkValidPosition(p))*/

  override def steps: Int = 1
  override def isAllowed(position: ChessPosition): Boolean =
    currentPosition.y - position.y <= 1 && currentPosition.x - position.x <= 1

  override def possibleMoves: List[ChessPosition] = {
    ChessHelper.checkCoordinates(currentPosition)

    getPositions(steps, currentPosition).filter(
      p => ChessHelper.checkValidMove(p, currentPosition) && isAllowed(p)
    )
  }
}

