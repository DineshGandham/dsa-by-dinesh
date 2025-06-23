import java.util.Scanner;

public class SumNo {
    Scanner scanner = new Scanner(System.in);

    public void sum() {
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        scanner.close();
        System.out.println("The sum of the given numbers is: " + (firstNumber + secondNumber));
    }
}
