# edit-distance

[Original practice problem](https://leetcode.com/problems/edit-distance/)

Date: 2026-11-18 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**. Language: **Java**.

## Approach

Dynamic programming computes edit distance. dp[i][j] stores the minimum operations to convert the first i characters of word1 to the first j characters of word2. If the current characters match, dp[i][j]=dp[i-1][j-1]; otherwise dp[i][j]=1+min(replace=dp[i-1][j-1], delete=dp[i-1][j], insert=dp[i][j-1]). First row/column are initialized to i/j (all inserts or deletes). Time complexity O(m*n), space O(m*n) where m and n are the lengths of the strings.

## Verification

Solution generated in Java and verified Accepted on LeetCode by autonomous AI bot.
