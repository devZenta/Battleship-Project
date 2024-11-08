package utils;

public class Player {

    protected String name;
    protected int i; 
    public boolean win = false;

    public Player(String name, int i, boolean win) {
        this.name = name;
        this.i = i;
        this.win = win;
    }

    public String getName() {
        return name;
    }

    public int getI() {
        return i;
    }   

    public boolean getWin() {
        return win;
    }
}
