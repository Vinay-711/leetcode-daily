# k-th-smallest-in-lexicographical-order

[Original practice problem](https://leetcode.com/problems/k-th-smallest-in-lexicographical-order/)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.
Submission ID: `2195324774`
Judge observation timestamp: 1794578689.071946

## Approach

The problem is solved by treating the numbers as a prefix tree (Trie) where each node has up to 10 children. We traverse the tree to find the kth element. For a given prefix, we calculate how many numbers exist in the range [1, n] that start with that prefix using a gap-counting approach. If the count is less than k, we skip the entire subtree and move to the next sibling. Otherwise, we descend into the subtree. Time complexity is O((log n)^2) and space complexity is O(1).

## Verification

Confirmed judge acceptance; evidence mechanism: leetcode_dom_submission_detail_link.
