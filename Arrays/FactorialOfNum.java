public class FactorialOfNum {
 
    /**
     * Calculates the factorial of a given number using recursion.
     * 
     * This method takes an integer as input and returns its factorial by recursively multiplying
     * the number by the factorial of the number minus one, until it reaches the base case of 1.
     * 
     * @param num The number for which to calculate the factorial.
     * @return The factorial of the given number.
     */
    public static int factorialOfNum(int num) {
         if(num <= 1) {
            return 1;
         } else {
          return num*factorialOfNum(num-1);
         }
    }
}
