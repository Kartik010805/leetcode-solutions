class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int[] in = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int[]edges:prerequisites){
            int u=edges[0];
            int v=edges[1];
            adj.get(v).add(u);
            in[u]++;
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(in[i]==0){
                q.offer(i);
            }
        }
        int count=0;
        while(!q.isEmpty()){
            int node=q.poll();
            count++;
            for(int n:adj.get(node)){
                in[n]--;
                if(in[n]==0){
                    q.offer(n);
                }
            }
        }
        return count==numCourses;
    }
}