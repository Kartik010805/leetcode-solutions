class Solution {
    public int numEnclaves(int[][] grid) {
       int n=grid.length;
       int m=grid[0].length;
       int res=0;
       for(int i=0;i<n;i++){
         if(grid[i][0]==1){
            dfs(grid,i,0);
         }
         if(grid[i][m-1]==1){
            dfs(grid,i,m-1);
         }
       } 
       for(int j=0;j<m;j++){
        if(grid[0][j]==1){
            dfs(grid,0,j);
        }
        if(grid[n-1][j]==1){
            dfs(grid,n-1,j);
        }
       }for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]==1){
                res++;
            }
        }
       }
       return res;
       }
      public void dfs(int[][]grid,int i,int j){
        grid[i][j]=0;
    //    dfs(grid,i-1,j);
      //  dfs(grid,i+1,j);
        //dfs(grid,i,j-1);
        //dfs(grid,i,j+1);
        int[]x={-1,1,0,0};
        int[]y={0,0,-1,1};
        int n=grid.length;
       int m=grid[0].length;
       for(int k=0;k<4;k++){
        int row=i+x[k];
        int col=j+y[k];
        if((row >=0 && row<n && col>=0 && col<m) && grid[row][col]==1)
        dfs(grid,row,col);
       }
       }
       
    
    
}