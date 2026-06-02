class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue=new ArrayDeque<>();
        boolean [][]visited=new boolean[grid.length][grid[0].length];
        int fresh=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2) {
                    queue.offer(new int[]{i,j,0});
                    visited[i][j]=true;
                }else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int time=0;
        while(!queue.isEmpty()){
            int[] curr=queue.poll();
            int r=curr[0];
            int c=curr[1];
            int t=curr[2];
            time=Math.max(time,t);
            if(r-1>=0 && !visited[r-1][c] && grid[r-1][c]==1){
                visited[r-1][c]=true;
                fresh--;
                queue.offer(new int[]{r-1,c,t+1});
            }
            if(r+1<grid.length && !visited[r+1][c] && grid[r+1][c]==1){
                visited[r+1][c]=true;
                fresh--;
                queue.offer(new int[]{r+1,c,t+1});
            }
            if(c-1>=0 && !visited[r][c-1] && grid[r][c-1]==1){
                visited[r][c-1]=true;
                fresh--;
                queue.offer(new int[]{r,c-1,t+1});
            }
            if(c+1<grid[0].length && !visited[r][c+1] && grid[r][c+1]==1){
                visited[r][c+1]=true;
                fresh--;
                queue.offer(new int[]{r,c+1,t+1});
            }
        }
        return fresh==0?time:-1;
    }
}