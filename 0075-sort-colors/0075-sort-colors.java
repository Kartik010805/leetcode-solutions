class Solution {
    public void sortColors(int[] nums) {
        int i=0,    
            k=0,
            j=nums.length-1;
            while(k<=j){
                if(nums[k]==1){
                    k+=1;
                }else if(nums[k]==2){
                    int temp=nums[k];
                    nums[k]=nums[j];
                    nums[j]=temp;
                    j-=1;
                }else{
                      int temp=nums[k];
                    nums[k]=nums[i];
                    nums[i]=temp;
                    i+=1;
                    k+=1;
                }
            }
    }
}