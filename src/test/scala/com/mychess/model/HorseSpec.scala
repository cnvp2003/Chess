package com.mychess.model

import org.scalatest.{FlatSpec, Matchers}

class HorseSpec extends FlatSpec with Matchers {

  "possibleMoves" should "return list of moves" in {
    Horse(ChessPosition(4, 4)).possibleMoves shouldBe(List(ChessPosition(6,5), ChessPosition(6,3), ChessPosition(5,6), ChessPosition(5,2), ChessPosition(3,6), ChessPosition(3,2), ChessPosition(2,5), ChessPosition(2,3)))
  }

  "possibleMoves" should "return empty list of moves for not valid position" in {
    Horse(ChessPosition(7, 8)).possibleMoves shouldBe(List())
  }

  "possibleMoves" should "return correct list of moves for top left corner position" in {
    Horse(ChessPosition(0, 0)).possibleMoves shouldBe(List(ChessPosition(2,1), ChessPosition(1,2)))
  }

  "possibleMoves" should "return correct list of moves for top right corner position" in {
    Horse(ChessPosition(0, 7)).possibleMoves shouldBe(List(ChessPosition(2,6), ChessPosition(1,5)))
  }

  "possibleMoves" should "return correct list of moves for bottom left corner position" in {
    Horse(ChessPosition(7, 0)).possibleMoves shouldBe(List(ChessPosition(6,2), ChessPosition(5,1)))
  }

  "possibleMoves" should "return correct list of moves for bottom right corner position" in {
    Horse(ChessPosition(7, 7)).possibleMoves shouldBe(List(ChessPosition(6,5), ChessPosition(5,6)))
  }

}
