// Last updated: 7/31/2025, 12:52:20 AM
class Solution {
    public int singleNumber(int[] nums) {
        int unique=0;
        for(int n:nums){
            unique^=n;
        }
        return unique;
    }
}