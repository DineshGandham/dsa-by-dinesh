public class ButterflyPattern {

    /*
     * This program prints a butterfly pattern using asterisks.
     * The pattern consists of two halves, each with a decreasing number of stars
     * and increasing spaces in between.
     */
    // output:
    // Example output for n = 5:    
    /*
     * *         *
     * **       **
     * ***     ***
     * ****   ****
     * **********
     * ****   ****
     * ***     ***
     * **       **
     * *         *
     */
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}