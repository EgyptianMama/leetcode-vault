class Solution {
    public int maxPathScore(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int[][] dp = new int[m * n][k + 1]; 
        
        for (int[] row : dp) Arrays.fill(row, -1);
        dp[0][0] = 0; 
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int cell = i * n + j;
                int val = grid[i][j];
                int cost = val > 0 ? 1 : 0;
                
                for (int c = 0; c <= k; c++) {
                    if (dp[cell][c] == -1) continue;
                    if (j + 1 < n) {
                        int nc = c + (grid[i][j+1] > 0 ? 1 : 0);
                        if (nc <= k) {
                            int next = i * n + (j + 1);
                            dp[next][nc] = Math.max(dp[next][nc], 
                                                    dp[cell][c] + grid[i][j+1]);
                        }
                    }
                    if (i + 1 < m) {
                        int nc = c + (grid[i+1][j] > 0 ? 1 : 0);
                        if (nc <= k) {
                            int next = (i + 1) * n + j;
                            dp[next][nc] = Math.max(dp[next][nc], 
                                                    dp[cell][c] + grid[i+1][j]);
                        }
                    }
                }
            }
        }
        int last = (m - 1) * n + (n - 1);
        int ans = -1;
        for (int c = 0; c <= k; c++) {
            ans = Math.max(ans, dp[last][c]);
        }
        return ans;
    }
}