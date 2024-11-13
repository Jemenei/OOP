package Problem1_A;

public class Main {
    public static void main(String[] args) {
        Shape3D cylinder = new Cylinder(3,3);
        System.out.println("Cylinder Volume: " + cylinder.volume());
        System.out.println("Cylinder Surface Area: " + cylinder.surfaceArea());


        Shape3D sphere = new Sphere(4);
        System.out.println("Sphere Volume: " + sphere.volume());
        System.out.println("Sphere Surface Area: " + sphere.surfaceArea());


        Shape3D cube = new Cube(2);
        System.out.println("Cube Volume: " + cube.volume());
        System.out.println("Cube Surface Area: " + cube.surfaceArea());
    }
}
