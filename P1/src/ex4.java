import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the coefficient c: ");
        double c = scanner.nextDouble();

        double D = (b * b) - (4 * a * c);

        if (D > 0) {
            double root1 = (-b + Math.sqrt(D)) / (2 * a);
            double root2 = (-b - Math.sqrt(D)) / (2 * a);

            System.out.println("The equation has the 2 real and distincts roots: ");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (D == 0) {
            double root = (-b) / (2 * a);
            System.out.println("The equation has the 1 real root: ");
            System.out.println("Root = " + root);
        } else {
            System.out.println("The equation has not the real root");
        }

        scanner.close();
    }
}
