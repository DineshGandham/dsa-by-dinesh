import java.util.HashMap;

public class TwoSum {
    /**
     * Finds two indices in an array such that the numbers at those indices add up to a target sum.
     * 
     * This method uses a hash map to store the numbers and their indices as it iterates through the array.
     * It checks if the complement (target - current number) exists in the map, and if so, returns the indices.
     * 
     * @param nums the array of integers
     * @param target the target sum
     * @return an array containing the two indices, or null if no such indices exist
     */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[] { map.get(diff), i };
            }
            map.put(nums[i], i);
        }
        return null;
    }   
}
