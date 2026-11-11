class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;

        // Create a new array with padded 1s at both ends
        // newNums[0] = 1, newNums[n+1] = 1
        // newNums[1...n] = original nums
        int[] newNums = new int[n + 2];
        newNums[0] = 1;
        newNums[n + 1] = 1;
        for (int i = 0; i < n; i++) {
            newNums[i + 1] = nums[i];
        }

        // dp[i][j] represents the maximum coins obtained by bursting all balloons
        // strictly between index i and index j in newNums.
        // i.e., bursting newNums[i+1], newNums[i+2], ..., newNums[j-1].
        // newNums[i] and newNums[j] act as boundary balloons that are not burst within this subproblem.
        int[][] dp = new int[n + 2][n + 2];

        // 'len' is the length of the interval (j - i).
        // It represents the number of elements in the subproblem (j - i - 1).
        // We iterate 'len' from 2 up to n+1.
        // len = 2 means there is 1 balloon between i and j (e.g., newNums[i+1])
        // len = n+1 means there are n balloons between i and j (e.g., newNums[1...n])
        for (int len = 2; len <= n + 1; len++) {
            // 'i' is the left boundary index in newNums
            for (int i = 0; i <= n + 1 - len; i++) {
                // 'j' is the right boundary index in newNums
                int j = i + len;

                // 'k' is the index of the balloon that is burst LAST in the range (i, j)
                // k must be strictly between i and j
                for (int k = i + 1; k < j; k++) {
                    // coins = (coins from left subproblem) + (coins from right subproblem) + (coins from bursting k last)
                    // When k is burst last, its neighbors are newNums[i] and newNums[j]
                    int currentCoins = newNums[i] * newNums[k] * newNums[j];
                    dp[i][j] = Math.max(dp[i][j], dp[i][k] + dp[k][j] + currentCoins);
                }
            }
        }

        // The final answer is dp[0][n+1], which represents bursting all balloons
        // between newNums[0] and newNums[n+1], i.e., newNums[1...n] (the original nums).
        return dp[0][n + 1];
    }
}