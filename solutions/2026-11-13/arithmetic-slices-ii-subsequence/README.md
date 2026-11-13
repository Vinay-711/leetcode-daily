# arithmetic-slices-ii-subsequence

[Original practice problem](https://leetcode.com/problems/arithmetic-slices-ii-subsequence/)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.
Submission ID: `2195325295`
Judge observation timestamp: 1794578744.257856

## Approach

We use dynamic programming with an array of HashMaps. dp[i][diff] stores the number of arithmetic subsequences ending at index i with common difference 'diff'. For each pair (i, j) where j < i, we calculate diff = nums[i] - nums[j]. The number of subsequences ending at j with difference diff is added to dp[i][diff], and we also add 1 (representing the pair (j, i)). The total count of arithmetic subsequences of length >= 3 is accumulated by adding the count of subsequences of length >= 2 ending at j to the total whenever we extend them to i. Time complexity is O(N^2) and space complexity is O(N^2).

## Verification

Confirmed judge acceptance; evidence mechanism: leetcode_dom_submission_detail_link.
