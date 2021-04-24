package com.mychess.model
import org.scalatest.{FlatSpec, Matchers}

class KingSpec extends FlatSpec with Matchers {

  "possibleMoves" should "return list of moves" in {
    King(ChessPosition(5, 5)).possibleMoves shouldBe(List(ChessPosition(6,6), ChessPosition(6,5), ChessPosition(6,4), ChessPosition(5,6), ChessPosition(5,4), ChessPosition(4,6), ChessPosition(4,5), ChessPosition(4,4)))
  }

  "possibleMoves" should "return empty list of moves for not valid position" in {
    King(ChessPosition(7, 8)).possibleMoves shouldBe(List())
  }

  "possibleMoves" should "return correct list of moves for top left corner position" in {
    King(ChessPosition(0, 0)).possibleMoves shouldBe(List(ChessPosition(1,1), ChessPosition(1,0), ChessPosition(0,1)))
  }

  "possibleMoves" should "return correct list of moves for top right corner position" in {
    King(ChessPosition(0, 7)).possibleMoves shouldBe(List(ChessPosition(1,7), ChessPosition(1,6), ChessPosition(0,6)))
  }

  "possibleMoves" should "return correct list of moves for bottom left corner position" in {
    King(ChessPosition(7, 0)).possibleMoves shouldBe(List(ChessPosition(7,1), ChessPosition(6,1), ChessPosition(6,0)))
  }

  "possibleMoves" should "return correct list of moves for bottom right corner position" in {
    King(ChessPosition(7, 7)).possibleMoves shouldBe(List(ChessPosition(7,6), ChessPosition(6,7), ChessPosition(6,6)))
  }

}
