import java.util.*;

class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int n = s1.length();
        int m = s2.length();
        if (n + m != s3.length()) return false;
        // dp[j] corresponds to using first i chars of s1 and first j chars of s2
        boolean[] dp = new boolean[m + 1];
        dp[0] = true;
        // initialize first row (i = 0)
        for (int j = 1; j <= m; j++) {
            dp[j] = dp[j - 1] && s2.charAt(j - 1) == s3.charAt(j - 1);
        }
        for (int i = 1; i <= n; i++) {
            // update dp[0] for current i (j = 0)
            dp[0] = dp[0] && s1.charAt(i - 1) == s3.charAt(i - 1);
            for (int j = 1; j <= m; j++) {
                char c3 = s3.charAt(i + j - 1);
                boolean fromS1 = dp[j] && s1.charAt(i - 1) == c3; // dp[j] is previous row's dp[i-1][j]
                boolean fromS2 = dp[j - 1] && s2.charAt(j - 1) == c3; // dp[j-1] is current row's dp[i][j-1]
                dp[j] = fromS1 || fromS2;
            }
        }
        return dp[m];
    }
}