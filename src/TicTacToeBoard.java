import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicTacToeBoard {
    private int[][] board;
    public static int EMPTY = 0;
    public static int PLAYER_X = 1;
    public static int PLAYER_O = 2;

    public TicTacToeBoard() {
        board = new int[3][3];
    }

    public int getCell(int row, int col) {
        return 1;
    }

    public boolean placeMove(int row, int col, int player) {
        return true;
    }

    public boolean isValidMove(int row, int col) {
        return true;
    }

    public int checkRowWin(int row) {
        return 1;
    }

    public int checkColWin(int col) {
        return 1;
    }

    public int checkMainDiagonalWin() {
        return 1;
    }

    public int checkAntiDiagonalWin() {
        return 1;
    }

    public int checkWinner() {
        return 1;
    }

    public boolean isFull() {
        return true;
    }

    public void displayBoard () {
        System.out.print("display");
    }

    public void resetBoard () {
        System.out.print("reset");
    }


@Nested
class TTTTester {
        TicTacToeBoard board1;
        @BeforeEach
        public void setup() {
            board1 = new TicTacToeBoard();
        }
        @ParameterizedTest
        public void testTTTBoard() {
            for(int row = 0; row < 3; row++) {
                for(int col = 0; col < 3; col++) {
                    assertEquals(TicTacToeBoard.EMPTY, board1.board[row][col]);
                }
            }
        }

        public void testGetCell(int row, int col) {


        }
}

    public static void main(String[] args) {

    }
}