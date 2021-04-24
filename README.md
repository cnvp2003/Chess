# CHESS
## Problem Statement: 
You are required to create a program, which simulates a chessboard and the
movements of various types of pieces on the chessboard.

### Chessboard:
The chessboard is an 8 x 8 grid with 64 cells in it.
With 8 rows (A, B, C.... H) and 8 columns (1, 2, 3.... 8), each cell can be uniquely identified with its cell number. 
This can be seen illustrated below.
```
00 01 02 03 04 05 06 07
10 11 12 13 14 15 16 17
20 21 22 23 24 25 26 27
30 31 32 33 34 35 36 37
40 41 42 43 44 45 46 47
50 51 52 53 54 55 56 57
60 61 62 63 64 65 66 67
70 71 72 73 74 75 76 77
```

Chess pieces and their movements:
The game of chess has 6 unique types of pieces, with their own unique types of movements. These are:
* 1.) King – Can move only 1 step at a time in all 8 directions (horizontal, vertical
and diagonal)
* 2.) Queen – Can move across the board in all 8 directions
* 3.) Bishop – Can move across the board only diagonally
* 4.) Horse – Can move across the board only in 2.5 steps (2 vertical steps and 1
horizontal step)
* 5.) Rook – Can move across the board only vertically and horizontally
* 6.) Pawn – Can move only 1 step at a time, in the forward direction, vertically. Can also move 1 step forward diagonally, in order to eliminate an opposing piece.


#### Objective of your program:

Your program should simulate the movement of each unique chess piece on an empty chessboard.
* Input – The input string to your program will be the Type of chess piece and
its Position (cell number) on the chessboard. E.g. “King D5”
* Output – Once you execute the program, the output will be a string of all
possible cells in which the chess piece can move.

Sample inputs and outputs:

```
Input – “King 55”
Output – “66 65 64 56 54 46 45 44”
```

## Prerequisite
    * Scala install
    * Sbt setup 

## Run testCases
    sbt:chess> run ChessFindMovesApp

## Run testCases
    sbt:chess> test