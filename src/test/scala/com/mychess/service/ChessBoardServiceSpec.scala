package com.mychess.service

import com.mychess.model.{ChessPosition, Horse, King, Queen}
import org.scalatest.{FlatSpec, Matchers}

class ChessBoardServiceSpec extends FlatSpec with Matchers {

  val chessBoardService = new ChessBoardService

  trait env {
    val king = King(ChessPosition(5, 5))
    val invalidKing = King(ChessPosition(7, 8))
    val queen = Queen(ChessPosition(4, 6))
    val horse = Horse(ChessPosition(7, 3))
  }

  "findMoves" should "return list of moves with specified piece" in new env {
    val result1 = chessBoardService.findMoves(king)
    result1 shouldBe List(ChessPosition(6,6), ChessPosition(6,5), ChessPosition(6,4), ChessPosition(5,6), ChessPosition(5,4), ChessPosition(4,6), ChessPosition(4,5), ChessPosition(4,4))

    val result2 = chessBoardService.findMoves(queen)
    result2 shouldBe List(ChessPosition(7,6), ChessPosition(7,3), ChessPosition(6,6), ChessPosition(6,4), ChessPosition(5,7),
      ChessPosition(5,6), ChessPosition(5,5), ChessPosition(4,7), ChessPosition(4,5), ChessPosition(4,4), ChessPosition(4,3),
      ChessPosition(4,2), ChessPosition(4,1), ChessPosition(4,0), ChessPosition(3,7), ChessPosition(3,6), ChessPosition(3,5),
      ChessPosition(2,6), ChessPosition(2,4), ChessPosition(1,6), ChessPosition(1,3), ChessPosition(0,6), ChessPosition(0,2))

    val result3 = chessBoardService.findMoves(horse)
    result3 shouldBe List(ChessPosition(6,5), ChessPosition(6,1), ChessPosition(5,4), ChessPosition(5,2))
  }

  "findMoves" should "return empty list for invalid piece position" in new env {
    val result1 = chessBoardService.findMoves(invalidKing)
    result1 shouldBe List.empty
  }

}
