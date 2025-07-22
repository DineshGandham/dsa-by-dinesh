public class RunningSum {
    /**
     * Computes the running sum of an array.
     * 
     * The running sum at each index is the sum of all previous elements including the current element.
     * 
     * @param nums the array of integers
     * @return an array containing the running sums
     */
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }
        return result;
    }
}
