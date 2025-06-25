import java.util.Scanner;

public class EvenOrOdd {
    
    public void checkEvenOrOdd() {
      Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is even or odd: ");
        int number = scanner.nextInt();
        if(number %2 == 0) {
            System.out.println("The number " + number + " is even.");
        } else {
            System.out.println("The number " + number + " is odd.");
        }
    }
}
