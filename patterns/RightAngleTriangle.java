package patterns;

/**
 * This class prints a right angle triangle pattern using asterisks.
 * The height of the triangle is determined by the input parameter n.
 */
public class RightAngleTriangle {
 
// Output:
    // * 
    // ** 
    // *** 
    // **** 
    // ***** 

    public void printRightAngleTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * This method prints a right angle triangle pattern in reverse order.
     * The height of the triangle is determined by the input parameter n.
     */

    // Output:
        // ***** 
        // **** 
        // *** 
        // ** 
        // *
    public void printRightAngleTriangleReverse(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * This method prints a right aligned triangle pattern using asterisks.
     * The height of the triangle is determined by the input parameter n.
     */

    // Output:
        //     * 
        //    ** 
        //   *** 
        //  **** 
        // *****
    public static void printRightAlignedStarTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
