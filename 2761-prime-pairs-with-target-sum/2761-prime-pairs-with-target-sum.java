class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        boolean[] p=new boolean[n+1];
        for(int i=0;i<=n;i++){
            p[i]=true;
        }
        for(int i=2;i*i<=n;i++){
            if(p[i]){
                for(int j=i*i;j<=n;j+=i){
                    p[j]=false;
                }
            }
        }
         int count =0;
        for(int i=2;i<=n;i++){
            if(p[i]) count ++;
        }
        int[]arr=new int[count];
        int k=0;
        for(int i=2;i<=n;i++){
            if(p[i]){
                arr[k++]=i;
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<count;i++){
            int a=arr[i];
            int b=n-a;
            if(b>=a && p[b]){
                ans.add(Arrays.asList(a,b));
            }
        }
        return ans;
    }
}