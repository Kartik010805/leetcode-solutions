class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] result=new int[n];
        int posidx=0;
        int negidx=1;
        for(int num:nums){
            if(num>=0){
                result[posidx]=num;
                posidx+=2;
            }else{
                result[negidx]=num;
                negidx+=2;
            }
        }
        return result;
    }
}