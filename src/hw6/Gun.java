package hw6;

public class Gun {
    private String type;
    private double accuracy;
    private int range;

    public Gun(String type, double accuracy, int range) {
        this.type = type;
        this.accuracy = accuracy;
        this.range = range;
    }

    public String getType() {
        return type;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public int getRange() {
        return range;
    }
}
