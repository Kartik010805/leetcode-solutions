class Solution {
    public int maximumSum(int[] arr) {
        int ans=arr[0];
        int nodelete=arr[0];
        int onedelete=Integer.MIN_VALUE+1000;
        for(int i=1;i<arr.length;i++){
            onedelete=Math.max(nodelete,onedelete+arr[i]);
            nodelete=Math.max(arr[i],nodelete+arr[i]);
            ans=Math.max(ans,Math.max(onedelete,nodelete));
        }
        return ans;
    }
}