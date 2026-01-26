class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int right=0,left=0;
        int minlen=Integer.MAX_VALUE;
        int sum=0;
        while(right<nums.length){
            sum+=nums[right];
            right++;
        
        while(sum>=target){
            minlen=Math.min(minlen,right-left);
            sum-=nums[left];
            left++;
        }}
        return (minlen==Integer.MAX_VALUE)?0:minlen;
    }
}