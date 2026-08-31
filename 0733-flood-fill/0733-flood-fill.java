class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
     int n=image.length;
     int m=image[0].length;
     int or=image[sr][sc];
      if(or == newColor)
            return image;
     dfs(image,sr,sc,newColor,or);
     return image;
    }
    public void dfs(int[][]image,int sr,int sc,int newColor,int or){
        image[sr][sc]=newColor;
        
         int n=image.length;
         int m=image[0].length;
        int []x={-1,1,0,0};
        int []y={0,0,-1,1};
        for(int i=0;i<4;i++){
            int nr=sr+x[i];
            int nc=sc+y[i];
            if(nr >=0 && nr<n && nc >=0 && nc<m && image[nr][nc]==or){
                dfs(image,nr,nc,newColor,or);
            }
        }
    }
}