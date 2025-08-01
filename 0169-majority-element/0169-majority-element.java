class Solution {
    public int majorityElement(int[] nums) {
        int len=nums.length;
        
        for(int i=0;i<len;i++){
            int count=0;
            for(int j=0;j<len;j++){
                if(nums[j]==nums[i]){
                    count++;
                }
            }
            if(count>len/2){
                return nums[i];
            }
        }
        return -1;
    }
}