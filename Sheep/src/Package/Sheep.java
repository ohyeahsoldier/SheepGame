package Package;

public class Sheep {
    private int x;
    private int y;
    public Sheep(int x, int y) { //Should I prevent from going to invalid squares?
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void moveRight(int x) {
        this.x += x;
    }
    public void moveUp(int y) {
        this.y -= y;
    }
}
