package patterns;

public class DiamondPattern {


    /**
     * Prints a diamond pattern based on the input integer.
     * 
     * This method takes an integer as input and prints a diamond shape using asterisks.
     * The upper part of the diamond consists of increasing rows of asterisks, while the
     * lower part consists of decreasing rows.
     * 
     * @param num the number of rows in the upper part of the diamond
     */

//      Output:

//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 
// * * * * * 
//  * * * * 
//   * * * 
//    * * 
//     * 
    public void printDiamondPattern(int num) {
        // Print the upper part of the diamond
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Print the lower part of the diamond
        for (int l = num; l >= 1; l--) {
            for (int m = 1; m <= num - l; m++) {
                System.out.print(" ");
            }
            for (int n = 1; n <= l; n++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
