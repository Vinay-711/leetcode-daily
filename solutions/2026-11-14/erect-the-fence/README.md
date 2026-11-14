# erect-the-fence

[Original practice problem](https://leetcode.com/problems/erect-the-fence/)

Date: 2026-11-14 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The problem asks for the Convex Hull of a set of points. I used the Monotone Chain algorithm, which sorts the points and constructs the upper and lower hulls separately. The cross product is used to determine the orientation of triplets of points. To handle collinear points on the hull, I use a non-strict inequality in the cross product check. The time complexity is O(n log n) due to sorting, and space complexity is O(n).

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
