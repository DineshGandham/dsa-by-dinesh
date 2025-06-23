package Strings;
import java.util.Scanner;

public class CheckPalindrome {
    
    public void checkPlaindrome() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string/Int to check if it is a palindrome:");
        String input = scanner.nextLine();
        scanner.close();
        String reversedInput = new StringBuilder(input).reverse().toString();
        if (input.equals(reversedInput)) {
            System.out.println("The given string/Int is a palindrome.");
        } else {
            System.out.println("The given string/Int is not a palindrome.");
        }
    }
}
