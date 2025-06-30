package patterns;

public class NumberPattern {
    
    // Output:

    // 1
    // 23
    // 456
    // 78910
    // 1112131415
    /**
     * Prints a number pattern based on the input integer.
     * 
     * This method takes an integer as input and prints a pattern of numbers where each
     * row contains an increasing sequence of numbers starting from 1. The number of
     * elements in each row corresponds to the row number.
     * 
     * @param num the number of rows in the pattern
     */
    public void numPattern(int num) {
        int display = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(display);
                display++;
            }
            System.out.println();
        }
  }
}
