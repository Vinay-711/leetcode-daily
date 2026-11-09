# implement-stack-using-queues

[Original practice problem](https://leetcode.com/problems/implement-stack-using-queues/)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

I implemented the stack using a single queue. When pushing an element, I add it to the back of the queue and then rotate the queue by moving the previous elements (size - 1) to the back, effectively placing the new element at the front. This makes push O(n) and pop/top O(1). Space complexity is O(n).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
