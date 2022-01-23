package practice2;

public class Plane extends Transport{

    public Plane(int fuel, int speed) {
        super(fuel, speed);
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

    public void fillFuel(int n) {
        super.fuel += n;
    }

}
