class Solution {

    public int swimInWater(int[][] grid) {
        int n = grid.length;

        int low = Math.max(grid[0][0], grid[n - 1][n - 1]);
        int high = n * n - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (canReach(grid, mid))
                high = mid;
            else
                low = mid + 1;
        }

        return low;
    }

    private boolean canReach(int[][] grid, int money) {
        int n = grid.length;

        if (grid[0][0] > money)
            return false;

        Queue<int[]> q = new LinkedList<>();
        boolean[][] vis = new boolean[n][n];

        q.offer(new int[]{0, 0});
        vis[0][0] = true;

        int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};

        while (!q.isEmpty()) {
            int[] cur = q.poll();

            int r = cur[0];
            int c = cur[1];

            if (r == n - 1 && c == n - 1)
                return true;

            for (int[] d : dir) {
                int nr = r + d[0];
                int nc = c + d[1];

                if (nr >= 0 && nc >= 0 && nr < n && nc < n &&
                    !vis[nr][nc] &&
                    grid[nr][nc] <= money) {

                    vis[nr][nc] = true;
                    q.offer(new int[]{nr, nc});
                }
            }
        }

        return false;
    }
}