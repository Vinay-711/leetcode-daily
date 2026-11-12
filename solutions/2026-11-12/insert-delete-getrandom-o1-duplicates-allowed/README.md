# insert-delete-getrandom-o1-duplicates-allowed

[Original practice problem](https://leetcode.com/problems/insert-delete-getrandom-o1-duplicates-allowed/)

Date: 2026-11-12 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

To achieve O(1) average time complexity, we use an ArrayList to store elements for O(1) random access and a HashMap to store the indices of each value. Since there can be duplicates, the HashMap maps each value to a LinkedHashSet of indices. When removing an element, we swap it with the last element in the ArrayList to maintain O(1) removal, updating the indices in the HashMap accordingly. Time complexity: O(1) average for all operations. Space complexity: O(N) where N is the number of elements.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
