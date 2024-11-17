package utils;
import java.util.Random;

public class Game {

    protected int nbPlayers;
    protected int nbPlayersInit;
    public Player[] tabPlayers;
    protected int currentPlayer = 0;

    public Game() {
        System.out.println("Game created :");
        System.out.println();
    }

    public void getNbPlayers(int nbPlayers) {
        this.nbPlayers = nbPlayers;
        this.nbPlayersInit = 0;
        this.tabPlayers = new Player[nbPlayers];
    }

    public void createPlayers(Player a) {
        this.tabPlayers[nbPlayersInit++] = a;
    }

    public void displayPlayer() {
        for (int i = 0; i < this.nbPlayers; i++) {
            System.out.println("Player " + (i + 1) + " : " + this.tabPlayers[i].getName());
        }
    }

    public boolean verifyWinCondition(Player a) {
        boolean result = false;
        if (a.getWin() == true) {
            System.out.println("Player " + a.getName() + " wins !");
            result = true;
        }
        return result;
    }

    public boolean verifyWin() {
        boolean result = false;
        for (int i = 0; i < this.nbPlayers; i++) {
            if (this.tabPlayers[i].getWin() == true) {
                System.out.println("Player " + this.tabPlayers[i].getName() + " wins !");
                result = true;
                break;
            }
        }
        return result;
    }

    public int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    public void switchPlayer() {

        int index = 1;

        if ( this.currentPlayer == 0 ) {
            System.out.println("Current player : " + this.currentPlayer + 1);
            String tag = this.tabPlayers[this.currentPlayer].getName();
            System.out.println("It's " + tag + "'s turn");
            this.currentPlayer = 1;
        } else {
            this.currentPlayer = this.currentPlayer + index;

        if (this.currentPlayer >= this.nbPlayers) {
            this.currentPlayer = 0;
        } 

        System.out.println("Current player : " + this.currentPlayer + 1);

        String tag = this.tabPlayers[this.currentPlayer].getName();
        System.out.println("It's " + tag + "'s turn");
        }

        /*this.currentPlayer = this.currentPlayer + index;

        if (this.currentPlayer >= this.nbPlayers) {
            this.currentPlayer = 0;
        } 

        System.out.println("Current player : " + this.currentPlayer + 1);

        String tag = this.tabPlayers[this.currentPlayer].getName();
        System.out.println("It's " + tag + "'s turn");

        return this.currentPlayer;*/
    }
}