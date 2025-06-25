import java.util.Scanner;

/**
 * This class generates and prints the Fibonacci series up to a specified number of terms.
 */

public class FibonacciSeries {

    // This method generates and prints the Fibonacci series up to a specified number of terms.
    public void fibonacciSeries() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();
        int a =0; int b = 1; int c = 1;
        for(int i=1;i<=n;i++) {
            System.out.print(a + " ");
            c = a+b;
            b = a;
            a = c;
        }
    }
}