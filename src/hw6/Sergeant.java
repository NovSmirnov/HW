package hw6;

public class Sergeant extends Soldier{
    private double managementLevel;
    private double extraAccuracy = 1.1;

    public Sergeant(String name, int accuracy, Gun gun, double managementLevel) {
        super(name, accuracy, gun);
        this.managementLevel = managementLevel;
    }

    public double getManagementLevel() {
        return managementLevel;
    }

    @Override
    public double shooting() {
        setLuck(Math.random() + 1);
        return getAccuracy() * getGun().getAccuracy() * getGun().getRange() * getLuck() * extraAccuracy;
    }
}
