package Arrays;

import java.util.Arrays;

public class ReverseArray {
    
    // This method reverses a given array and prints the reversed array.
    // It initializes an array with values, creates a new array to hold the reversed values,
    // and then iterates through the original array in reverse order to fill the new array.
    /**
     * Reverses the elements of an array and prints the reversed array.
     */
    public void reverseArray() {
        int[] arr= {1, 2, 3, 4, 5};
        int n = arr.length;
        int[] arr2= new int[n];
        for(int i=n-1; i>=0;i--) {
            arr2[n-1-i] = arr[i];
        }
        System.out.print("Reversed Array: ");
        for(int i=0; i<n; i++) {
            System.out.print(arr2[i] + " ");
        }
    }


    // This method reverses an array in place by swapping elements.
    /**
     * Reverses the elements of an array in place using swapping and prints the reversed array.
     */
    
    public void reverseArrayWithSwap() {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int start = 0; int end = n - 1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.print("Reversed Array with Swap: ");
        System.out.println(Arrays.toString(arr));
    }
}
