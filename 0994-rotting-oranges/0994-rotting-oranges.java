class Solution { 
    public int orangesRotting(int[][] grid) { 
        int n = grid.length; 
        int m = grid[0].length; 
 
        int time = 0; 
        int fresh = 0; 
 
        Queue<int[]> queue = new LinkedList<>(); 
 
        for(int i = 0; i < n; i++) { 
            for(int j = 0; j < m; j++) { 
                if(grid[i][j] == 1) { 
                    fresh++; 
                } 
 
                if(grid[i][j] == 2) { 
                    queue.offer(new int[]{i, j}); 
                } 
            } 
        } 
 
        int[] x = {-1, 1, 0, 0}; 
        int[] y = {0, 0, -1, 1}; 
 
        while(!queue.isEmpty() && fresh > 0) { 
            int size = queue.size(); 
 
            for(int i = 0; i < size; i++) { 
                int[] curr = queue.poll(); 
 
                int r = curr[0]; 
                int c = curr[1]; 
 
                for(int k = 0; k < 4; k++) { 
                    int nr = r + x[k]; 
                    int nc = c + y[k]; 
 
                    if(nr >= 0 && nr < n && 
                       nc >= 0 && nc < m && 
                       grid[nr][nc] == 1) { 
 
                        grid[nr][nc] = 2; 
                        fresh--; 
 
                        queue.offer(new int[]{nr, nc}); 
                    } 
                } 
            } 
 
            time++; 
        } 
 
        if(fresh > 0) { 
            return -1; 
        } 
 
        return time; 
    } 
}