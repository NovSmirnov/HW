package practice2;

public class Vector3D extends Vector{
    public Vector3D(int x1, int y1, int z1, int x2, int y2, int z2) {
        super(x1, y1, z1, x2, y2, z2);
    }

    public double getLength() {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) + (z2 - z1) * (z2 - z1));
    }

    public String getVectorCords() {
        return String.format("%d %d %d", x2 - x1, y2 - y1, z2 - z1);
    }

    public double getScalarProduct(Vector3D vector) {
        int comp1ThisVect = super.x1 - super.x2;
        int comp2ThisVect = super.y1 - super.y2;
        int comp3ThisVect = super.z1 - super.z2;

        int comp1SecVect = vector.x1 - vector.x2;
        int comp2SecVect = vector.y1 - vector.y2;
        int comp3SecVect = vector.z1 - vector.z2;

        return comp1ThisVect * comp1SecVect + comp2ThisVect * comp2SecVect + comp3ThisVect * comp3SecVect;
    }
}
