package com.mychess.service

import com.mychess.model._

trait ChessBoard{
  def findMoves(chessPiece: PieceType):List[ChessPosition]
}

class ChessBoardService extends ChessBoard {

  def findMoves(chessPiece: PieceType): List[ChessPosition]={
    chessPiece match {
      case k: King => k.possibleMoves
      case q: Queen => q.possibleMoves
      case b: Bishop => b.possibleMoves
      case h: Horse => h.possibleMoves
      case r: Rook => r.possibleMoves
      case p: Pawn => p.possibleMoves
    }
  }

}

