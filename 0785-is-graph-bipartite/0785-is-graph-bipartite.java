class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] color=new int[graph.length];
        Arrays.fill(color,-1);
        for(int i=0;i<graph.length;i++){
            if(color[i]==-1){
                if(!dfs(graph,color,0,i)){
                    return false;
                }
            }
           
        }
        return true;
    }
    public boolean dfs(int [][] graph,int[] color,int c,int node){
        color[node]=c;
        for(int j=0;j<graph[node].length;j++){
            int n=graph[node][j];
            if(color[n] !=-1 && color[n]==c){
                return false;
            }
            if(color[n]==-1){
               if(! dfs(graph,color,1-c,n))
               return false;
            }
        }
        return true;
    }
}