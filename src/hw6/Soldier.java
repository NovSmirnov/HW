package hw6;

public class Soldier {
    private String name;
    private int accuracy;
    private double luck = 1.0;
    private Gun gun;

    public Soldier(String name, int accuracy, Gun gun) {
        this.name = name;
        this.accuracy = accuracy;
        this.gun = gun;
    }

    public String getName() {
        return name;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setLuck(double luck) {
        this.luck = luck;
    }

    public double getLuck() {
        return luck;
    }

    public Gun getGun() {
        return gun;
    }

    public double shooting() {
        luck = Math.random() + 1;
        return accuracy * gun.getAccuracy() * gun.getRange() * luck;
    }
}
