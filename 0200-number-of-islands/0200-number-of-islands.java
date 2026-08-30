class Solution {
    public int numIslands(char[][] grid) {
         int n=grid.length;
      int m=grid[0].length;
      int island=0;
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]=='1'){
                island++;
                dfs(grid,i,j);
                
            }
        }
      } 
      return island;
    }
    public void dfs(char [][]grid,int i,int j){
        grid[i][j]='0';
        int[]x={-1,1,0,0};
        int []y={0,0,-1,1};
            int n=grid.length;
      int m=grid[0].length;
        for(int k=0;k<4;k++){
            int row=i+x[k];
            int col=j+y[k];
            if((row>= 0 && row<n && col>=0&& col<m)&& grid[row][col]=='1'){
                dfs(grid,row,col);
            }
        }
    }
}