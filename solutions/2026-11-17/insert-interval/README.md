# insert-interval

[Original practice problem](https://leetcode.com/problems/insert-interval/)

Date: 2026-11-17 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The algorithm iterates through the sorted intervals once. It adds all intervals that end before the new interval starts. Then, it merges all overlapping intervals by updating the start and end of the new interval. Finally, it adds the merged interval and any remaining intervals that start after the new interval ends. Time complexity is O(n) and space complexity is O(n) to store the result.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
