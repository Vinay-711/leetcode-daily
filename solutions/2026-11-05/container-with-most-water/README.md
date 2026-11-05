# container-with-most-water

[Original practice problem](https://leetcode.com/problems/container-with-most-water/)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The problem is solved using the two-pointer approach. We initialize one pointer at the beginning and one at the end of the array. At each step, we calculate the area formed by the lines at these pointers and update the maximum area found so far. We then move the pointer pointing to the shorter line inward, as moving the longer line would only decrease the width without potentially increasing the height. The time complexity is O(n) and the space complexity is O(1).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
