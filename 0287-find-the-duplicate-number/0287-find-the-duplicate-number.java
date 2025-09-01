class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        Arrays.sort(nums);
        for(int num:nums){
            if(nums[i]==nums[i+1]){
                return nums[i];
                
            }
            else{
                i++;
            }
        }
         return -1;
    
    }
   
    
}