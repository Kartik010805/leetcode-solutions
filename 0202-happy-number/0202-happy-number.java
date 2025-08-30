class Solution {
    public boolean isHappy(int n) {
        return ans(n)==1;}
        public int ans(int n){
            if (n==1)return 1;
            if (n == 4) return -1;
            
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum+rem*rem;
            n=n/10;
            
        }
        return ans(sum);
    }
 }

