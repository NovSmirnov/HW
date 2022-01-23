package practice2;

public class Car extends Transport{
    private int maxPassengers;

    public Car(int fuel, int speed, int maxPassengers) {
        super(fuel, speed);
        this.maxPassengers = maxPassengers;
    }

    public int getFuelLevel() {
        return super.fuel;
    }

    public boolean canMove(int n) {
        if (super.fuel >= n) {
            super.fuel -= n;
            return true;
        } else {
            return false;
        }
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }
}
