class Solution {
    public int closedIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0) {
                    if (dfs(grid, i, j)) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public boolean dfs(int[][] grid, int i, int j) {
        int n = grid.length;
        int m = grid[0].length;

        if (i < 0 || i >= n || j < 0 || j >= m) {
            return false;
        }

        if (grid[i][j] == 1) {
            return true;
        }

        grid[i][j] = 1;

        int[] x = {-1, 1, 0, 0};
        int[] y = {0, 0, -1, 1};

        boolean closed = true;

        for (int k = 0; k < 4; k++) {
            int r = i + x[k];
            int c = j + y[k];

            if (!dfs(grid, r, c)) {
                closed = false;
            }
        }

        return closed;
    }
}