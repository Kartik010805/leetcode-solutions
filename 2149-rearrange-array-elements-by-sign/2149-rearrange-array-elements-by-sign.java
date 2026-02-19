class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] positive=new int[n/2];
        int[] negative=new int[n/2];
        int k=0,j=0;
        
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                negative[k]=nums[i];
                k++;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                positive[j]=nums[i];
                j++;
            }
        }
        int p=0,neg=0;
        for(int i=0;i<n/2;i++){
            nums[2*i]=positive[p];
            p++;
            
            nums[2*i+1]=negative[neg];
            neg++;
            
        }
        return nums;
    }
}