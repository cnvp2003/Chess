package com.mychess.model

import org.scalatest.{FlatSpec, Matchers}

class PawnSpec extends FlatSpec with Matchers {

  "possibleMoves" should "return list of forward moves" in {
    ///* Assumption: Assume that the board is empty. This means that the pawn cannot move diagonally.*/
    //Pawn(ChessPosition(4, 2)).possibleMoves shouldBe(List(ChessPosition(3,3), ChessPosition(3,2), ChessPosition(3,1)))
    Pawn(ChessPosition(4, 2)).possibleMoves shouldBe(List(ChessPosition(3,2)))
  }

  "possibleMoves" should "return empty list of moves for not valid position" in {
    Pawn(ChessPosition(7, 8)).possibleMoves shouldBe(List())
  }

  "possibleMoves" should "return correct list of moves for top left corner position" in {
    Pawn(ChessPosition(0, 0)).possibleMoves shouldBe(List())
  }

  "possibleMoves" should "return correct list of moves for top right corner position" in {
    Pawn(ChessPosition(0, 7)).possibleMoves shouldBe(List())
  }

  "possibleMoves" should "return correct list of moves for bottom left corner position" in {
    ///* Assumption: Assume that the board is empty. This means that the pawn cannot move diagonally.*/
    //Pawn(ChessPosition(7, 0)).possibleMoves shouldBe(List(ChessPosition(6,1), ChessPosition(6,0)))
    Pawn(ChessPosition(7, 0)).possibleMoves shouldBe(List(ChessPosition(6,0)))
  }

  "possibleMoves" should "return correct list of moves for bottom right corner position" in {
    ///* Assumption: Assume that the board is empty. This means that the pawn cannot move diagonally.*/
    //Pawn(ChessPosition(7, 7)).possibleMoves shouldBe(List(ChessPosition(6,7), ChessPosition(6,6)))
    Pawn(ChessPosition(7, 7)).possibleMoves shouldBe(List(ChessPosition(6,7)))
  }

}
