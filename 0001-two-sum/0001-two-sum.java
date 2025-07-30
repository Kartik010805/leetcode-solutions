public class Solution { // Class name must be 'Solution' as per LeetCode
    
    public int[] twoSum(int[] nums, int target) { // LeetCode calls this method
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; // Return indices if found
                }
            }
        }
        return new int[]{-1, -1}; // Ensure the return array is always of size 2
    }
}
