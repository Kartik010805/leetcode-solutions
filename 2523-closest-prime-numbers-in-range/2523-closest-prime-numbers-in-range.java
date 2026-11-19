class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[]p=new boolean[right+1];
        for(int i=2;i<=right;i++){
            p[i]=true;
        }
        for(int i=2;i*i<=right;i++){
            if(p[i]){
                for(int j=i*i;j<=right;j+=i){
                    p[j]=false;
                }
            }
        }
        int first=-1;
        int second=-1;
        int diff=Integer.MAX_VALUE;
        int prev=-1;
       for(int i=left;i<=right;i++){
    if(p[i]){
        if(prev!=-1 && i-prev<diff){
            diff=i-prev;
            first=prev;
            second=i;
        }
        prev=i;
    }
}
        return new int []{first,second};
    }
}