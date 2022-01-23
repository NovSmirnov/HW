package practice2;

public class Vector2D extends Vector{

    public Vector2D(int x1, int y1, int x2, int y2) {
        super(x1, y1, 0, x2, y2, 0);
    }

    public double getLength() {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    public String getVectorCords() {
        //return String.format(x1 + " " + y1 + " " + x2 + " " + y2);
        return String.format("%d %d", x2 - x1, y2 - y1);
    }

    public double getScalarProduct(Vector2D vector) {
        int comp1ThisVect = super.x1 - super.x2;
        int comp2ThisVect = super.y1 - super.y2;

        int comp1SecVect = vector.x1 - vector.x2;
        int comp2SecVect = vector.y1 - vector.y2;

        return comp1ThisVect * comp1SecVect + comp2ThisVect * comp2SecVect;
    }

    public double getAngle(Vector2D vector) {
        if (getLength() != 0 && vector.getLength() != 0) {
            double scalarProd = getScalarProduct(vector);
            double len1 = getLength();
            double len2 = vector.getLength();
            return scalarProd / (len1 * len2);
        } else {
            return -2.0;
        }
    }
}
