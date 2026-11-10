# find-median-from-data-stream

[Original practice problem](https://leetcode.com/problems/find-median-from-data-stream/)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

I used two heaps: a max-heap to store the smaller half of the numbers and a min-heap to store the larger half. This ensures that the median is always accessible at the roots of the heaps. addNum takes O(log N) time, and findMedian takes O(1) time. Space complexity is O(N).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
