# merge-intervals

[Original practice problem](https://leetcode.com/problems/merge-intervals/)

Date: 2026-11-17 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The approach involves sorting the intervals by their start times, which takes O(N log N) time. Then, we iterate through the sorted intervals once, maintaining a list of merged intervals. If the current interval overlaps with the last added interval (i.e., current start <= last end), we merge them by updating the end time. Otherwise, we add the current interval as a new entry. The space complexity is O(N) to store the result.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
