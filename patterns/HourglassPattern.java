package patterns;


public class HourglassPattern {

    /**
     * Prints an hourglass pattern of asterisks based on the input integer.
     * 
     * This method takes an integer as input and prints an hourglass pattern where
     * the upper part consists of decreasing rows of asterisks, and the lower part
     * consists of increasing rows of asterisks. The number of asterisks in each row
     * corresponds to the row number, and the rows are centered to form an hourglass shape.
     * 
     * @param n the number of rows in the upper part of the hourglass pattern
     */
    //output:
// * * * * * 
//  * * * * 
//   * * * 
//    * * 
//     * 
//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 

    public void printHourglassPattern(int n) {
        // Print the upper part of the hourglass
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
