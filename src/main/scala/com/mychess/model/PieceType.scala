package com.mychess.model

trait PieceType {

  def getPositions(steps: Int, position: ChessPosition): List[ChessPosition] ={
    var positions = List.empty[ChessPosition]
    var rowStart = position.x-steps
    var rowEnd = position.x + steps
    var colStart = position.y-steps
    var colEnd =  position.y + steps

    if(rowStart <= 0) rowStart = 0
    if(rowEnd > 7) rowEnd = 7
    if(colStart <= 0) colStart = 0
    if(colEnd > 7) colEnd = 7

    for {
      row <- rowStart to rowEnd
      column <- colStart to colEnd
    } yield {
      positions = ChessPosition(row, column) :: positions
    }

    positions
  }

}
