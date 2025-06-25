import java.util.Scanner;

public class ArmStrong {
    
    /**
     * This method checks if a given number is an Armstrong number.
     * An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
     */
    public void checkArmStrong() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
