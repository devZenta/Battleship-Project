package utils;

public class Game {

    protected int nbPlayers;
    protected int nbPlayersInit;
    public Player[] tabPlayers;

    public Game(int nbPlayers) {
        this.nbPlayers = nbPlayers;
        this.nbPlayersInit = 0;
        this.tabPlayers = new Player[nbPlayers];
        System.out.println("Game created with " + nbPlayers + " players");
        System.out.println();
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
        tabPlayers[nbPlayersInit++] = a;
    }

    public void displayPlayer() {
        for (int i = 0; i < nbPlayers; i++) {
            System.out.println("Player " + (i + 1) + " : " + tabPlayers[i].getName());
        }
    }

    public boolean verifyWin() {
        boolean result = false;
        for (int i = 0; i < nbPlayers; i++) {
            if (tabPlayers[i].getWin() == true) {
                result = true;
            }
        }
        return result;
    }
}