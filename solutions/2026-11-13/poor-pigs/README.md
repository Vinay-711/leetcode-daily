# poor-pigs

[Original practice problem](https://leetcode.com/problems/poor-pigs/)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.
Submission ID: `2195325674`
Judge observation timestamp: 1794578785.705587

## Approach

The problem can be modeled as finding the number of pigs 'p' such that (minutesToTest / minutesToDie + 1)^p >= buckets. Each pig can exist in 'T + 1' states, where T is the number of testing rounds (minutesToTest / minutesToDie). With 'p' pigs, we can distinguish (T + 1)^p unique outcomes. We solve for the smallest integer 'p' using Math.log or a simple loop. Time complexity is O(log(buckets)) and space complexity is O(1).

## Verification

Confirmed judge acceptance; evidence mechanism: leetcode_dom_submission_detail_link.
