class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        // If the starting cell is an obstacle, there are no paths.
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }

        // Create a DP table to store the number of ways to reach each cell.
        // dp[i][j] will store the number of unique paths to reach (i, j).
        int[][] dp = new int[m][n];

        // Base case: There is one way to reach the starting cell (0,0).
        dp[0][0] = 1;

        // Fill the first row
        // A cell (0, j) can only be reached from (0, j-1).
        // If (0, j) is an obstacle, or if (0, j-1) was unreachable, then (0, j) is unreachable.
        for (int j = 1; j < n; j++) {
            if (obstacleGrid[0][j] == 0) {
                dp[0][j] = dp[0][j - 1];
            } else {
                dp[0][j] = 0; // Obstacle at (0,j)
            }
        }

        // Fill the first column
        // A cell (i, 0) can only be reached from (i-1, 0).
        // Similar logic as the first row.
        for (int i = 1; i < m; i++) {
            if (obstacleGrid[i][0] == 0) {
                dp[i][0] = dp[i - 1][0];
            } else {
                dp[i][0] = 0; // Obstacle at (i,0)
            }
        }

        // Fill the rest of the DP table
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    // If there's an obstacle, no paths can go through this cell.
                    dp[i][j] = 0;
                } else {
                    // The number of ways to reach (i, j) is the sum of ways to reach (i-1, j) and (i, j-1).
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }

        // The result is the number of ways to reach the bottom-right corner.
        return dp[m - 1][n - 1];
    }
}