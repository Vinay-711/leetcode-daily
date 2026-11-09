# the-skyline-problem

[Original practice problem](https://leetcode.com/problems/the-skyline-problem/)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

We use a sweep-line algorithm with a PriorityQueue to track active building heights. We decompose each building into two events: a start event (negative height to distinguish from end events and sort by height descending) and an end event. We sort events by x-coordinate. As we iterate through events, we add/remove heights from the max-heap. If the current max height changes, we record a new key point. Time complexity is O(N log N) due to sorting and heap operations, space complexity is O(N).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
