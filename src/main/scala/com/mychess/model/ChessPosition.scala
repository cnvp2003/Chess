package com.mychess.model

case class ChessPosition(x:Int, y:Int){
  override def toString: String = s"$x$y"
}
