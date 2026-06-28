class Solution {
    boolean res=true;
    public boolean isBipartite(int[][] graph) {
        int[] color=new int[graph.length];
        Arrays.fill(color,-1);
        for(int i=0;i<graph.length;i++){
            if(color[i]==-1){
                dfs(graph,color,0,i);
                       
            }
           
        }
        return res;
    }
    public void dfs(int [][] graph,int[] color,int c,int node){
        if(!res) return;
        color[node]=c;
        for(int j=0;j<graph[node].length;j++){
            int n=graph[node][j];
            if(color[n] !=-1 && color[n]==c){
                res = false;
                return;
            }
            if(color[n]==-1){
                dfs(graph,color,1-c,n);
               
            }
        }
        return;
    }
}