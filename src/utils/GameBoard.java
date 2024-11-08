package utils;

public class GameBoard {

    protected String[][] board;

    public GameBoard(int rows, int columns) {
    
        this.board = new String[rows][columns];

    }

    public void displayBoard(int rows, int columns) {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                board[i][j] = ".";
                System.out.print("[" + board[i][j] + "]");
            }
            System.out.println();
        }
        System.out.println();
    }
}
