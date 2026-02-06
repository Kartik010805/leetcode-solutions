class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxE = nums[0];
        int minE = nums[0];
        int ans = Math.abs(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            maxE = Math.max(nums[i], maxE + nums[i]);
            minE = Math.min(nums[i], minE + nums[i]);
            ans = Math.max(ans, Math.max(Math.abs(maxE), Math.abs(minE)));
        }
        return ans;
    }
}