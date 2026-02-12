class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n=nums.length;
        long [] ps= new long[n+1];
        for(int i=0;i<n;i++){
            ps[i+1]=ps[i]+nums[i];
        }
        Deque<Integer>dq=new ArrayDeque<>();
        int minlen=Integer.MAX_VALUE;
        for(int j=0;j<=n;j++){
            while(!dq.isEmpty() && ps[j]-ps[dq.peekFirst()]>=k){
                minlen=Math.min(minlen,j-dq.pollFirst());
            }
            while(!dq.isEmpty() && ps[j]<=ps[dq.peekLast()]){
                dq.pollLast();
            }
            dq.offerLast(j);
        }
        return minlen==Integer.MAX_VALUE?-1:minlen;
    }
}