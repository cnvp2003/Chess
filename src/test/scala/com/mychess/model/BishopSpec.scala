package com.mychess.model

import org.scalatest.{FlatSpec, Matchers}

class BishopSpec extends FlatSpec with Matchers {

  "possibleMoves" should "return list of moves" in {
    Bishop(ChessPosition(4, 2)).possibleMoves shouldBe(List(ChessPosition(7,5), ChessPosition(6,4), ChessPosition(6,0), ChessPosition(5,3), ChessPosition(5,1), ChessPosition(3,3), ChessPosition(3,1), ChessPosition(2,4), ChessPosition(2,0), ChessPosition(1,5), ChessPosition(0,6)))
  }

  "possibleMoves" should "return empty list of moves for not valid position" in {
    Bishop(ChessPosition(7, 8)).possibleMoves shouldBe(List())
  }

  "possibleMoves" should "return correct list of moves for top left corner position" in {
    Bishop(ChessPosition(0, 0)).possibleMoves shouldBe(List(ChessPosition(7,7), ChessPosition(6,6), ChessPosition(5,5), ChessPosition(4,4), ChessPosition(3,3), ChessPosition(2,2), ChessPosition(1,1)))
  }

  "possibleMoves" should "return correct list of moves for top right corner position" in {
    Bishop(ChessPosition(0, 7)).possibleMoves shouldBe(List(ChessPosition(7,0), ChessPosition(6,1), ChessPosition(5,2), ChessPosition(4,3), ChessPosition(3,4), ChessPosition(2,5), ChessPosition(1,6)))
  }

  "possibleMoves" should "return correct list of moves for bottom left corner position" in {
    Bishop(ChessPosition(7, 0)).possibleMoves shouldBe(List(ChessPosition(6,1), ChessPosition(5,2), ChessPosition(4,3), ChessPosition(3,4), ChessPosition(2,5), ChessPosition(1,6), ChessPosition(0,7)))
  }

  "possibleMoves" should "return correct list of moves for bottom right corner position" in {
    Bishop(ChessPosition(7, 7)).possibleMoves shouldBe(List(ChessPosition(6,6), ChessPosition(5,5), ChessPosition(4,4), ChessPosition(3,3), ChessPosition(2,2), ChessPosition(1,1), ChessPosition(0,0)))
  }

}
