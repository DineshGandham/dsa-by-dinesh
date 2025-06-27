package patterns;

public class RectanglePattern {
    
    /**
     * This method prints a rectangle pattern of asterisks.
     * The dimensions of the rectangle are determined by the input parameters n (rows) and m (columns).
     */
    // output:


    public void rectanglePatttern(int n, int m) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    /**
     * This method prints a hollow rectangle pattern of asterisks.
     * The dimensions of the rectangle are determined by the input parameters n (rows) and m (columns).
     */

    //  Output:

    //     ****
    //     *  *
    //     *  *
    //     *  *
    //     ****
    public void hollowRectanglePattern(int n, int m) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
