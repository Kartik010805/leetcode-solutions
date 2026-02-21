class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
       
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double maxAvg = sum / (double) k; 
        int j=k;
        for(int i=0;j<nums.length;i++){
            sum=sum-nums[i]+nums[j];
            double avg=sum/(double)(k);
            maxAvg=Math.max(maxAvg,avg);
            
            j++;
        }
        return maxAvg;
    }
}