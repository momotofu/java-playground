package com.company;

import java.text.MessageFormat;
import java.util.Optional;

public class TicTacToe {

    // Properties
    protected char[] board;
    protected char userMarker;
    protected char AiMarker;
    protected char winner;
    protected char currentMarker;

    // Constructor
    public TicTacToe(char userMarker, char AiMarker) {
        this.userMarker = userMarker;
        this.AiMarker = AiMarker;
        this.winner = '-';
        this.setBoard();
    }

    // Getters
    public char[] getBoard() {
        return this.board;
    }

    public char[] setBoard() {
        char[] board = new char[9];

        for (int i = 0; i < board.length; i++) {
            board[i] = '-';
        }

        return board;
    }

    public boolean playTurn(int spot) {
        boolean isValid = isInRange(spot) && !isSpotTaken(spot);
        if (isValid) {
            board[spot - 1] = currentMarker;
            currentMarker = currentMarker == AiMarker ? userMarker : AiMarker;
        }
        return isValid;
    }

    public boolean isInRange(int number) {
        return 0 < number && board.length + 1 > number;
    }

    public boolean isSpotTaken(int number) {
        return board[number - 1] != '-';
    }

    public void printBoard() {
        System.out.println();

        for (int i = 0; i < getBoard().length; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println();
                System.out.println("---------------");
            }
            System.out.print("|" + board[i]);
        }

        System.out.println();
    }

    public void printIndexBoard() {
        System.out.println();

        for (int i = 0; i < getBoard().length; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println();
                System.out.println("---------------");
            }
            System.out.print("|" + i + 1);
        }

        System.out.println();
    }

    public boolean isThereAWinnter() {
        boolean diagonalsAndMiddle = rightDia() || leftDia() || secondRow() || secondCol() && board[4] != '-';
        boolean leftTop = firstCol() || firstRow() && board[0] != '-';
        boolean rightBottom = thirdCol() || thirdRow() && board[8] != '-';

        if (diagonalsAndMiddle) {
            winner = board[4];
        } else if (leftTop) {
            winner = board[0];
        } else {
            winner = board[8];
        }

        return diagonalsAndMiddle || leftTop || rightBottom;
    }
}

