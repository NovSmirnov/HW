package practice2;

public class Square extends Quadrangle implements Figure{
    public Square(int a, String color) {
        super(a, a, color);
    }
    @Override
    public double area() {
        return a * a;
    }
    @Override
    public double perimeter() {
        return a * 4;
    }

    @Override
    public double getLargeDiagonal() {
        return Math.sqrt(Math.pow(a,2) * 2);
    }

    @Override
    public double getHeight() {
        return a;
    }

    @Override
    public String getColor() {
        return super.color;
    }

}
