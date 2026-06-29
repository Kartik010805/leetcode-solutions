class Solution {
    int[]dr={-1,1,0,0};
    int[]dc={0,0,-1,1};
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<m;i++){
            if(board[i][0]=='O'){
                dfs(board,i,0);
            }
            if(board[i][n-1]=='O'){
                dfs(board,i,n-1);
            }
        }
        for(int i=1;i<n;i++){
            if(board[0][i]=='O'){
                dfs(board,0,i);
            }
            if(board[m-1][i]=='O'){
                dfs(board,m-1,i);
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }
                else if(board[i][j]=='#'){
                    board[i][j]='O';
                }
            }
        }
        
    }
    public void dfs(char[][] board,int r,int c){
        int m=board.length;
        int n=board[0].length;
        if(r<0 || c<0 || r>=m || c>= n || board[r][c]!='O') return;
        board[r][c]='#';
        for(int i=0;i<4;i++){
            int nr=r+dr[i];
            int nc=c+dc[i];
            dfs(board,nr,nc);
        }
    }
}