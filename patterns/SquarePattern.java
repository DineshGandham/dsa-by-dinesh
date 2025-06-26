package patterns;

public class SquarePattern {
    
    /**
     * This method prints a square pattern of asterisks.
     * The size of the square is determined by the input parameter n.
     */
    public void printSquarePattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * This method prints a hollow square pattern of asterisks.
     * The size of the square is determined by the input parameter n.
     */
    public void printHollowSquarePattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
