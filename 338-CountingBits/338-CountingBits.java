// Last updated: 7/31/2025, 12:52:17 AM
class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        
        for(int i=0;i<=n;i++){
            int count=0;
        int x=i;
        while(x!=0){
            x&=(x-1);
            count++;
        }
        ans[i] = count;
        }
        return ans;
    }
}