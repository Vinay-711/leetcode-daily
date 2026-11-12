# data-stream-as-disjoint-intervals

[Original practice problem](https://leetcode.com/problems/data-stream-as-disjoint-intervals/)

Date: 2026-11-12 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

I used a TreeMap to store intervals where the key is the start of the interval and the value is the end. For each addNum, I check if the value can be merged with existing intervals (left neighbor, right neighbor, or both). This ensures O(log N) time complexity for addNum and O(N) for getIntervals, where N is the number of disjoint intervals.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
