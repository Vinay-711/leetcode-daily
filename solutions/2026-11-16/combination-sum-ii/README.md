# combination-sum-ii

[Original practice problem](https://leetcode.com/problems/combination-sum-ii/)

Date: 2026-11-16 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The problem is solved using backtracking with sorting to handle duplicates. By sorting the candidates, we can easily skip identical elements at the same recursion level to avoid duplicate combinations. Time complexity is O(2^n) in the worst case, and space complexity is O(n) for the recursion stack.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
