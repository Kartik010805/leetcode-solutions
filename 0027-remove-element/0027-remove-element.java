class Solution {
    public int removeElement(int[] nums, int val) {
        int k=nums.length-1;
        for(int i=0;i<=k;i++){
            if(nums[i]==val){
                int temp=nums[k];
                nums[k]=nums[i];
                nums[i]=temp;
                k--;
                i--;
            }
        }
        return k+1;
    }
}