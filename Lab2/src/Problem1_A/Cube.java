package Problem1_A;

public class Cube extends Shape3D {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double volume() {
        return Math.pow(side, 3);
    }

    public double surfaceArea() {
        return 6 * side * side;
    }
}
