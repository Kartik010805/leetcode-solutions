class Solution {
    public int diagonalPrime(int[][] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            int a=nums[i][i];
            int b=nums[i][nums.length-1-i];
            if(prime(a)){
                max=Math.max(max,a);
            }
            if(prime(b)){
                max=Math.max(max,b);
            }
        }
        return max;
    }
    public boolean prime(int num){
        if(num<2)return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0) return false;
        }
        return true;
    }
}