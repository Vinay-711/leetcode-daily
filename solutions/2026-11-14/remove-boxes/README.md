# remove-boxes

[Original practice problem](https://leetcode.com/problems/remove-boxes/)

Date: 2026-11-14 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The problem is solved using dynamic programming with memoization. We define a function dp(i, j, k) which represents the maximum points obtainable from the subarray boxes[i...j] with k boxes of the same color as boxes[j] already attached to the right. The state transition considers either removing the k+1 boxes of color boxes[j] immediately, or finding an index m < j such that boxes[m] == boxes[j] and merging the subproblems. The time complexity is O(n^4) and space complexity is O(n^3).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
