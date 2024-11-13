import java.util.Scanner;

public class ex2 {
    public static void main (String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");

        double side = scanner.nextDouble();

        double area = side * side;
        double perimeter = 4 * side;
        double diagonal = Math.sqrt(2) * side;

        System.out.println("Area " + area);
        System.out.println("Perimeter " + perimeter);
        System.out.println("Diagonal " + diagonal);

        scanner.close();
    }
}