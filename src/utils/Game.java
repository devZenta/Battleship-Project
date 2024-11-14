package utils;

public class Game {

    protected int nbPlayers;
    protected int nbPlayersInit;
    public Player[] tabPlayers;

    public Game() {
        //this.nbPlayers = nbPlayers;
        //this.nbPlayersInit = 0;
        //this.tabPlayers = new Player[nbPlayers];
        System.out.println("Game created :");
        System.out.println();
    }

    public void getNbPlayers(int nbPlayers) {
        this.nbPlayers = nbPlayers;
        this.nbPlayersInit = 0;
        this.tabPlayers = new Player[nbPlayers];
    }

    public int switchPlayer(int currentPlayer) {

        int index = 1;

        currentPlayer = currentPlayer + index;

        if (currentPlayer >= this.nbPlayers) {
            currentPlayer = 0;
        } 

        System.out.println("Current player : " + currentPlayer);

        String tag = tabPlayers[currentPlayer].getName();
        System.out.println("It's " + tag + "'s turn");

        return currentPlayer;
    }

    public void createPlayers(Player a) {
        this.tabPlayers[nbPlayersInit++] = a;
    }

    public void displayPlayer() {
        for (int i = 0; i < this.nbPlayers; i++) {
            System.out.println("Player " + (i + 1) + " : " + this.tabPlayers[i].getName());
        }
    }

    public boolean verifyWin() {
        boolean result = false;
        for (int i = 0; i < this.nbPlayers; i++) {
            if (this.tabPlayers[i].getWin() == true) {
                System.out.println("Player " + this.tabPlayers[i].getName() + " wins !");
                result = true;
            }
        }
        return result;
    }
}