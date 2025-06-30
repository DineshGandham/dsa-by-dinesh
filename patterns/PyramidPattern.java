package patterns;

public class PyramidPattern {
    
    /**
     * Prints a pyramid pattern of numbers based on the input integer.
     * 
     * This method takes an integer as input and prints a pyramid pattern where each
     * row contains an increasing sequence of numbers starting from 1. The number of
     * elements in each row corresponds to the row number, and the rows are centered
     * to form a pyramid shape.
     * 
     * @param num the number of rows in the pyramid pattern
     */
    public void printPyramidPattern(int num) {
        int display = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(display + " ");
                display++;
            }
            System.out.println();
        }
    }
}
