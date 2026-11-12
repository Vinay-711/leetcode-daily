# self-crossing

[Original practice problem](https://leetcode.com/problems/self-crossing/)

Date: 2026-11-12 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The problem is solved by identifying three geometric patterns where the path crosses itself: 1) The current line crosses the line three steps back (spiral inward), 2) The current line meets the line four steps back (perfect rectangle), or 3) The current line crosses the line five steps back (spiral outward then inward). We iterate through the array once, checking these conditions. Time complexity is O(n) and space complexity is O(1).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
