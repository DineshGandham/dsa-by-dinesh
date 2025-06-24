package Arrays;

public class LargestNumber {
    
    /**
     * Finds the largest number in an array of integers.
     * 
     * This method initializes an array with integer values, iterates through the array,
     * and keeps track of the largest number found. It prints the largest number at the end.
     */
    public void LargestNumber() {
        int[] arr = {9,45,3,90,100,98765};
        int largest = arr[0];
        for(int i=1;i <arr.length;i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest Number in the array is: " + largest);
    }
}
