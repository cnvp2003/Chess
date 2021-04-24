package com.mychess.app
import com.mychess.model.{ChessPosition, King}
import com.mychess.service.ChessBoardService

object ChessFindMovesApp extends App {

  val ChessBoardService = new ChessBoardService()
  val king = King(ChessPosition(5, 5))
  println(s"Position: ${king}")

  ChessBoardService.findMoves(king).map{ move =>
    print(s"${move.toString} ")
  }

}
