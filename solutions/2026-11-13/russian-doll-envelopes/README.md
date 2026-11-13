# russian-doll-envelopes

[Original practice problem](https://leetcode.com/problems/russian-doll-envelopes/)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.
Submission ID: `2195323599`
Judge observation timestamp: 1794578567.687341

## Approach

To solve this problem, we sort the envelopes primarily by width in ascending order and secondarily by height in descending order. This sorting strategy ensures that for envelopes with the same width, we can only pick at most one, as the descending height prevents picking multiple envelopes of the same width. After sorting, the problem reduces to finding the Longest Increasing Subsequence (LIS) of the heights. We use the standard O(N log N) patience sorting approach with binary search to find the LIS length. Time complexity is O(N log N) due to sorting and binary search, and space complexity is O(N) to store the LIS array.

## Verification

Confirmed judge acceptance; evidence mechanism: leetcode_dom_submission_detail_link.
