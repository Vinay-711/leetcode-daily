/* ==============================================================================
 * Platform: LeetCode
 * Language: Java
 * URL: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * Generated: 2026-11-05 00:55:29
 *
 * Approach:
 * This problem can be efficiently solved using the two-pointer technique. We maintain two pointers: `slow` and `fast`. The `slow` pointer indicates the next position where a unique element should be placed, effectively marking the end of the unique elements found so far. The `fast` pointer iterates through the entire array to find unique elements. Since the array is sorted, we only need to compare `nums[fast]` with `nums[fast - 1]`. If `nums[fast]` is different from `nums[fast - 1]`, it means we've encountered a new unique element. This unique element is then copied to `nums[slow]`, and `slow` is incremented. If `nums[fast]` is the same as `nums[fast - 1]`, it's a duplicate, and we simply skip it by incrementing `fast`. The initial element `nums[0]` is always considered unique, so `slow` starts at 1 (to place the second unique element) and `fast` also starts at 1. The final value of `slow` represents `k`, the number of unique elements. This approach modifies the array in-place.
 * ==============================================================================
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        // According to constraints, nums.length is at least 1.
        // If nums.length is 0, the problem statement implies it won't happen.
        // If it could be 0, we would return 0.

        // 'slow' pointer tracks the position where the next unique element should be placed.
        // It also represents the count of unique elements found so far (1-indexed).
        // The first element nums[0] is always unique and stays at its position.
        int slow = 1; 

        // 'fast' pointer iterates through the array starting from the second element.
        // It compares the current element with the previous one.
        for (int fast = 1; fast < nums.length; fast++) {
            // If the current element (nums[fast]) is different from the previous element (nums[fast-1]),
            // it means we found a new unique element.
            if (nums[fast] != nums[fast - 1]) {
                // Place this unique element at the 'slow' pointer's position.
                nums[slow] = nums[fast];
                // Move 'slow' pointer to the next available position for a unique element.
                slow++;
            }
            // If nums[fast] == nums[fast-1], it's a duplicate, so we just skip it
            // by letting the 'fast' pointer increment in the loop.
        }

        // 'slow' now represents the number of unique elements (k) and also
        // the index after the last unique element (0-indexed).
        return slow;
    }
}
