# count-the-repetitions

[Original practice problem](https://leetcode.com/problems/count-the-repetitions/)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.
Submission ID: `2195330894`
Judge observation timestamp: 1794579312.901488

## Approach

The problem is solved by detecting a cycle in the state transitions. We track the index in s2 reached after each iteration of s1. If we encounter an index in s2 that we have seen before, we have found a cycle. We can then calculate how many times s2 is completed within the cycle and extrapolate the result for the remaining n1 iterations. Time complexity is O(s1.length * s2.length), space complexity is O(s2.length).

## Verification

Confirmed judge acceptance; evidence mechanism: leetcode_dom_submission_detail_link.
