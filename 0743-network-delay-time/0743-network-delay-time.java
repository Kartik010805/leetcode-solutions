class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> adj = new ArrayList<>();
        for(int i=0;i<n+1;i++){
            adj.add(new ArrayList<>());
        }
        for(int [] nums:times){
            int u= nums[0];
            int v= nums[1];
            int w=nums[2];
            adj.get(u).add(new int[]{v,w});
        }
        int []dist=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;
        PriorityQueue<int[]> pq =new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.offer(new int[]{k,0});
        while(!pq.isEmpty()){
            int[]curr=pq.poll();
            int node=curr[0];
            int d=curr[1];
            if (d > dist[node]) continue;
            for(int[]next:adj.get(node)){
                int v=next[0];
                int w=next[1];
                if(dist[node]+w<dist[v]){
                    dist[v]=dist[node]+w;
                    pq.offer(new int[]{v,dist[v]});
                }
            }
        }
        int ans=0;
        for(int i=1;i<=n;i++){
            if(dist[i]==Integer.MAX_VALUE) return -1;
            ans=Math.max(ans,dist[i]);
        }
        return ans;

    }
}