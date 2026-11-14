# super-washing-machines

[Original practice problem](https://leetcode.com/problems/super-washing-machines/)

Date: 2026-11-14 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

First, check if the total number of dresses is divisible by the number of machines. If not, return -1. For each machine, calculate the net flow of dresses needed to reach the target (total/n). The minimum moves required is the maximum of either the absolute value of the cumulative sum of net flows (representing dresses moving across a boundary) or the maximum individual net flow required by any single machine. Time complexity is O(n), space complexity is O(1).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
