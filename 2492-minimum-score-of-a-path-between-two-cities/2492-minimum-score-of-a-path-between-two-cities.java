class Solution {
    public int minScore(int n, int[][] roads) {
      List<List<int[]>> graph = new ArrayList<>();
      for(int i=0;i<n+1;i++){
        graph.add(new ArrayList<>());
      }
      for(int [] road:roads){
        graph.get(road[0]).add(new int[]{road[1],road[2]});
        graph.get(road[1]).add(new int[]{road[0],road[2]});
      }
      Queue<Integer>q=new LinkedList<>();
      boolean[] visited=new boolean[n+1];
      q.offer(1);
      visited[1]=true;
      int ans=Integer.MAX_VALUE;
      while(!q.isEmpty()){
        int node=q.poll();
        for(int []next:graph.get(node)){
            ans=Math.min(ans,next[1]);
            if(!visited[next[0]]){
                visited[next[0]]=true;
                q.offer(next[0]);
            }
        }
      }
      return ans;
    }
}