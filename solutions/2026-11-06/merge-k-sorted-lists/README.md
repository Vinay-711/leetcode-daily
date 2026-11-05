# merge-k-sorted-lists

[Original practice problem](https://leetcode.com/problems/merge-k-sorted-lists/)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

I used a PriorityQueue to store the head of each non-empty linked list. By always extracting the minimum element from the heap and adding its next node back into the heap, we effectively merge the lists in O(N log k) time, where N is the total number of nodes and k is the number of lists. Space complexity is O(k) for the heap.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
