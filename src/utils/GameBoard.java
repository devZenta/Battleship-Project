package utils;

public class GameBoard {

    protected String[][] board;
    protected int rows;
    protected int columns;

    public GameBoard(int rows, int columns) {
    
        this.board = new String[rows][columns];
        this.rows = rows;
        this.columns = columns;

    }

    public void displayBoard() {

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                this.board[i][j] = ".";
                System.out.print("[" + this.board[i][j] + "]");
            }
            System.out.println();
        }
        System.out.println();
    }
}
