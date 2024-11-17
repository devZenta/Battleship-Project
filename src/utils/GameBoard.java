package utils;

public class GameBoard {

    protected String[][] defaultBoard;
    protected String[][] playerBoard;
    protected String[][] opponentBoard;
    protected int rows;
    protected int columns;

    public GameBoard(int rows, int columns) {
    
        this.defaultBoard = new String[rows][columns];
        this.rows = rows;
        this.columns = columns;

    }

    public void displayBoardDefault() {

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                this.defaultBoard[i][j] = ".";
                System.out.print("[" + this.defaultBoard[i][j] + "]");
            }
            System.out.println();
        }
        System.out.println();
    }
}
