# combination-sum

[Original practice problem](https://leetcode.com/problems/combination-sum/)

Date: 2026-11-16 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The problem is solved using backtracking. We explore all possible combinations by recursively subtracting the current candidate from the target. To avoid duplicate combinations, we pass the current index 'start' to the recursive calls, ensuring we only consider candidates from the current index onwards. Time complexity is O(N^(T/M)) where N is the number of candidates, T is the target, and M is the minimum candidate value. Space complexity is O(T/M) for the recursion stack.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
