class Solution {
    private int m, n;
    private int emptyCells;
    private int result = 0;
    private int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    
    private void dfs(int[][] grid, int currCount, int i, int j) {
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == -1) {
            return;
        }
        
        if (grid[i][j] == 2) {
            if (currCount == emptyCells) {
                result++;
            }
            return;
        }
        grid[i][j] = -1;
        
        for (int[] dir : directions) {
            int ni = i + dir[0];
            int nj = j + dir[1];
            dfs(grid, currCount + 1, ni, nj);
        }
        grid[i][j] = 0;
    }
    
    public int uniquePathsIII(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        emptyCells = 0;
        result = 0;
        
        int startX = 0, startY = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    emptyCells++;
                } else if (grid[i][j] == 1) {
                    startX = i;
                    startY = j;
                }
            }
        }
        
        emptyCells += 1;
        
        dfs(grid, 0, startX, startY);
        
        return result;
    }
}