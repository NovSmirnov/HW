package practice2;

public abstract class Transport {
    protected int fuel;
    protected int speed;

    public Transport(int fuel, int speed) {
        this.fuel = fuel;
        this.speed = speed;
    }

    public abstract boolean canMove(int n);

    public abstract int getFuelLevel();
}
