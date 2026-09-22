public class TicTacToeBoard {
    private int[][] board;
    public int EMPTY = 0;
    public int PLAYER_X = 1;
    public int PLAYER_O = 2;

    public TicTacToeBoard() {

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

}

    public static void main(String[] args) {

    }
}