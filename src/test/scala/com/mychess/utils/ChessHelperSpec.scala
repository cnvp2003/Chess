package com.mychess.utils

import com.mychess.model.ChessPosition
import org.scalatest.{FlatSpec, Matchers}

class ChessHelperSpec extends FlatSpec with Matchers {

  "checkValidMove" should "return true for valid move" in {
    ChessHelper.checkValidMove(ChessPosition(0, 1), ChessPosition(1, 1)).shouldBe(true)
  }

  "checkValidMove" should "return false for invalid move" in {
    ChessHelper.checkValidMove(ChessPosition(7, 1), ChessPosition(8, 1)).shouldBe(false)
  }

  "checkValidMove" should "return false for same position move" in {
    ChessHelper.checkValidMove(ChessPosition(3, 1), ChessPosition(3, 1)).shouldBe(false)
  }


  "checkCoordinates" should "return true for valid position" in {
    ChessHelper.checkCoordinates(ChessPosition(3, 1)).shouldBe(true)
  }

  "checkCoordinates" should "return false for invalid position" in {
    ChessHelper.checkCoordinates(ChessPosition(9, 4)).shouldBe(false)
  }

}
