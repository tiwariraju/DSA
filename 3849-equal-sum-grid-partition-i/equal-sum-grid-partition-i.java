class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        long total = 0;
        for (int[] row : grid) {
            for (int val : row) {
                total += val;
            }
        }

        // If total is odd → impossible
        if (total % 2 != 0) return false;

        // Horizontal cut
        long topSum = 0;
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n; j++) {
                topSum += grid[i][j];
            }
            if (topSum == total - topSum) return true;
        }

        // Vertical cut
        long leftSum = 0;
        for (int j = 0; j < n - 1; j++) {
            for (int i = 0; i < m; i++) {
                leftSum += grid[i][j];
            }
            if (leftSum == total - leftSum) return true;
        }

        return false;
    }
}