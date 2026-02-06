class Solution {
    public int maxProduct(int[] nums) {
        int maxE=nums[0];
        int minE=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            int v1=maxE*nums[i];
            int v2=nums[i];
            int v3=minE*nums[i];
            
            maxE = Math.max(v2, Math.max(v1, v3));
            minE = Math.min(v2, Math.min(v1, v3));

            ans = Math.max(ans, maxE);
        }
        
        return ans;
    }
}