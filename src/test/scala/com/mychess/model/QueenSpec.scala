package com.mychess.model

import org.scalatest.{FlatSpec, Matchers}

class QueenSpec extends FlatSpec with Matchers {

  "possibleMoves" should "return list of moves" in {
    Queen(ChessPosition(4, 2)).possibleMoves shouldBe(List(ChessPosition(7,5), ChessPosition(7,2), ChessPosition(6,4), ChessPosition(6,2), ChessPosition(6,0), ChessPosition(5,3), ChessPosition(5,2), ChessPosition(5,1), ChessPosition(4,7), ChessPosition(4,6), ChessPosition(4,5), ChessPosition(4,4), ChessPosition(4,3), ChessPosition(4,1), ChessPosition(4,0), ChessPosition(3,3), ChessPosition(3,2), ChessPosition(3,1), ChessPosition(2,4), ChessPosition(2,2), ChessPosition(2,0), ChessPosition(1,5), ChessPosition(1,2), ChessPosition(0,6), ChessPosition(0,2)))
  }

  "possibleMoves" should "return empty list of moves for not valid position" in {
    Queen(ChessPosition(7, 8)).possibleMoves shouldBe(List())
  }

  "possibleMoves" should "return correct list of moves for top left corner position" in {
    Queen(ChessPosition(0, 0)).possibleMoves shouldBe(List(ChessPosition(7,7), ChessPosition(7,0), ChessPosition(6,6), ChessPosition(6,0), ChessPosition(5,5), ChessPosition(5,0), ChessPosition(4,4), ChessPosition(4,0), ChessPosition(3,3), ChessPosition(3,0), ChessPosition(2,2), ChessPosition(2,0), ChessPosition(1,1), ChessPosition(1,0), ChessPosition(0,7), ChessPosition(0,6), ChessPosition(0,5), ChessPosition(0,4), ChessPosition(0,3), ChessPosition(0,2), ChessPosition(0,1)))
  }

  "possibleMoves" should "return correct list of moves for top right corner position" in {
    Queen(ChessPosition(0, 7)).possibleMoves shouldBe(List(ChessPosition(7,7), ChessPosition(7,0), ChessPosition(6,7), ChessPosition(6,1), ChessPosition(5,7), ChessPosition(5,2), ChessPosition(4,7), ChessPosition(4,3), ChessPosition(3,7), ChessPosition(3,4), ChessPosition(2,7), ChessPosition(2,5), ChessPosition(1,7), ChessPosition(1,6), ChessPosition(0,6), ChessPosition(0,5), ChessPosition(0,4), ChessPosition(0,3), ChessPosition(0,2), ChessPosition(0,1), ChessPosition(0,0)))
  }

  "possibleMoves" should "return correct list of moves for bottom left corner position" in {
    Queen(ChessPosition(7, 0)).possibleMoves shouldBe(List(ChessPosition(7,7), ChessPosition(7,6), ChessPosition(7,5), ChessPosition(7,4), ChessPosition(7,3), ChessPosition(7,2), ChessPosition(7,1), ChessPosition(6,1), ChessPosition(6,0), ChessPosition(5,2), ChessPosition(5,0), ChessPosition(4,3), ChessPosition(4,0), ChessPosition(3,4), ChessPosition(3,0), ChessPosition(2,5), ChessPosition(2,0), ChessPosition(1,6), ChessPosition(1,0), ChessPosition(0,7), ChessPosition(0,0)))
  }

  "possibleMoves" should "return correct list of moves for bottom right corner position" in {
    Queen(ChessPosition(7, 7)).possibleMoves shouldBe(List(ChessPosition(7,6), ChessPosition(7,5), ChessPosition(7,4), ChessPosition(7,3), ChessPosition(7,2), ChessPosition(7,1), ChessPosition(7,0), ChessPosition(6,7), ChessPosition(6,6), ChessPosition(5,7), ChessPosition(5,5), ChessPosition(4,7), ChessPosition(4,4), ChessPosition(3,7), ChessPosition(3,3), ChessPosition(2,7), ChessPosition(2,2), ChessPosition(1,7), ChessPosition(1,1), ChessPosition(0,7), ChessPosition(0,0)))
  }

}
