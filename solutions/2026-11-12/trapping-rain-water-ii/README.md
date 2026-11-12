# trapping-rain-water-ii

[Original practice problem](https://leetcode.com/problems/trapping-rain-water-ii/)

Date: 2026-11-12 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

We use a Min-PriorityQueue to simulate the boundary of the explored area. Starting from the outermost cells, we always process the cell with the minimum height. For each cell, we explore its neighbors; if a neighbor is lower than the current boundary height, it traps water equal to the difference, and we update the neighbor's height to the maximum of its original height and the boundary height. Time complexity is O(MN log(MN)) and space complexity is O(MN).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
