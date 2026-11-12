# perfect-rectangle

[Original practice problem](https://leetcode.com/problems/perfect-rectangle/)

Date: 2026-11-12 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The problem is solved by checking two conditions: 1) The sum of the areas of all individual rectangles must equal the area of the bounding box formed by the minimum and maximum coordinates. 2) The corners of the rectangles must cancel each other out such that only the four corners of the bounding box remain after processing all rectangles. We use a HashSet to track corners; if a corner appears an odd number of times, it remains in the set, otherwise it is removed. Time complexity is O(N) where N is the number of rectangles, and space complexity is O(N) to store the corners.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
