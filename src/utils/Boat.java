package utils;
public class Boat{

    protected String name;
    protected String id;
    protected int x;
    protected int y;
    protected int direction; // 0 = horizontal, 1 = vertical 
    protected int length;

    public Boat(String name, String id, int x, int y, int direction, int length) {

        this.name = name;
        this.id = id;
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.length = length;
        
    }

    public String getId() {
        return id;
    }

    public int getLength() {
        return length;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }   

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }
}
