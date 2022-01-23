package practice2;

public abstract class Quadrangle {
    protected int a;
    protected int b;
    protected String color;

    public Quadrangle(int a, int b, String color) {
        this.a = a;
        this.b = b;
        this.color = color;
    }

    public abstract double getLargeDiagonal();
    public abstract double getHeight();
    public abstract String getColor();
}
