import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if(isPalindrome(input)) {
            System.out.println("The string " + input + " is a palindrom");
        } else {
            System.out.println("The string " + input + " is a not palindrom");
        }

        scanner.close();

    }

    public static boolean isPalindrome(String str) {
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleanStr.length() - 1;

        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false;
            }
            left ++;
            right--;
        }

        return true;
    }
}
