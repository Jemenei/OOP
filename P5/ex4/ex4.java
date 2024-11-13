import java.util.*;

public class ex4 {
    public static void main(String[] args) {
        double leftOperand, result = 0.0, rightOperand;
        String leftString, operator, rightString;
        StringTokenizer tokenizer;
        Scanner in = new Scanner(System.in);

        tokenizer = new StringTokenizer(in.nextLine(), "+-*/", true);

        try {
            leftString = tokenizer.nextToken();
            operator = tokenizer.nextToken();
            rightString = tokenizer.nextToken();

            leftOperand = Double.parseDouble(leftString);
            rightOperand = Double.parseDouble(rightString);

            switch (operator) {
                case "+":
                    result = leftOperand + rightOperand;
                    break;
                case "-":
                    result = leftOperand - rightOperand;
                    break;
                case "*":
                    result = leftOperand * rightOperand;
                    break;
                case "/":
                    if (rightOperand != 0) {
                        result = leftOperand / rightOperand;
                    } else {
                        System.out.println("Cannot divide by zero");
                        return;
                    }
                    break;
                default:
                    System.out.println("Unknown operator");
                    return;
            }
            System.out.println("Result: " + result);
        } catch (NoSuchElementException nsee) {
            System.out.println("Invalid syntax");
        } catch (NumberFormatException nfe) {
            System.out.println("One or more operands is not a number");
        }
    }
}