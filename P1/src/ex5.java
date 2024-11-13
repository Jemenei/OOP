import java.util.Scanner;

public class ex5 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial balance: ");
        double initialBalance = scanner.nextDouble();

        System.out.print("Enter the interest rate (as persentage): ");
        double interestRate = scanner.nextDouble();

        double interestAmount = (interestRate / 100) * initialBalance;
        double newBalance = initialBalance + interestAmount;

        System.out.println("The interest amount is: " + interestAmount);
        System.out.println("The new Balance after adding interest amount is: " + newBalance);

        scanner.close();
    }
}
