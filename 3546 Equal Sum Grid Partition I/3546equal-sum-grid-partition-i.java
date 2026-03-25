import java.util.*;

class Solution {
    public static boolean canPartitionGrid(int[][] grid) {
        long totalSum = 0;
        for (int[] row : grid) {
            for (int val : row) {
                totalSum += val;
            }
        }
        if ((totalSum & 1) == 1) return false;

        long target = totalSum / 2;
        int r = grid.length;
        int c = grid[0].length;

        long rowSum = 0;
        long colSum = 0;
        for (int i = 0; i < r && rowSum < target; i++) {
            for (int j = 0; j < c; j++) {
                rowSum += grid[i][j];
            }
        }

        if (rowSum == target) return true;
        for (int j = 0; j < c && colSum < target; j++) {
            for (int i = 0; i < r; i++) {
                colSum += grid[i][j];
            }
        }

        return colSum == target;
    }
}