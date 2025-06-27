public class CountNum {
    /**
     * Counts the number of digits in a given integer.
     * 
     * This method initializes an integer value, then uses a while loop to repeatedly divide
     * the value by 10 until it becomes zero, counting the number of iterations to determine
     * the number of digits in the original value. It prints the count at the end.
     */

     int result = 0;
    public void countNum() {
        int value = 23456789;
        int count = 0;
        while(value!=0) {
            value = value/10;
            count++;
        }
        System.out.println("Number of digits in the given number is: " + count);
    }

    /**
     * Counts the number of digits in a given integer by converting it to a string.
     * 
     * This method initializes an integer value, converts it to a string, and then
     * calculates the length of the string to determine the number of digits. It prints
     * the count at the end.
     */
    public void countNumUsingString() {
        int value = 23456789;
        String strValue = Integer.toString(value);
        int count = strValue.length();
        System.out.println("Number of digits in the given number is: " + count);
    }

    /**
     * Counts the number of digits in a given integer by converting it to a character array.
     * 
     * This method initializes an integer value, converts it to a string, then to a character
     * array, and finally counts the number of characters in the array to determine the number
     * of digits. It prints the count at the end.
     */
    public void countNumUsingArray() {
        int num= 123456789;
        char [] arr = String.valueOf(num).toCharArray();
        int count = arr.length;
        System.out.println("Number of digits in the given number is: " + count);
    }

    /**
     * Counts the number of digits in a given integer using recursion.
     * 
     * This method initializes an integer value and calls a recursive method to count
     * the number of digits. The recursive method divides the number by 10 until it reaches
     * zero, incrementing the count at each step. It prints the count at the end.
     */
    public int count(int num) {
        int result = 0;
        if (num == 0) {
            return 0;
        }
        result++;
        count(num / 10);
        return result;
    }

}
