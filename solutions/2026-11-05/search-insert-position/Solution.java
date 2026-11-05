/* ==============================================================================
 * Platform: LeetCode
 * Language: Java
 * URL: https://leetcode.com/problems/search-insert-position/
 * Generated: 2026-11-05 01:03:37
 *
 * Approach:
 * The problem requires finding the index of a target value in a sorted array or its insertion point if not found, with O(log n) runtime complexity. This immediately suggests using binary search. We initialize `low` to 0 and `high` to `nums.length - 1`. An `ans` variable is initialized to `nums.length`, which serves as the default insertion point if the target is greater than all elements in the array. The binary search iteratively narrows down the search space. If `nums[mid]` equals the target, we return `mid`. If `nums[mid]` is less than the target, we search in the right half by setting `low = mid + 1`. If `nums[mid]` is greater than the target, `mid` is a potential insertion point (or the target is to its left), so we update `ans = mid` and search in the left half by setting `high = mid - 1`. After the loop terminates, `ans` will hold the correct index where the target is found or where it should be inserted to maintain the sorted order. This approach ensures O(log n) time complexity and O(1) space complexity.
 * ==============================================================================
 */

import java.util.*;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length; // Default insertion point if target is greater than all elements

        while (low <= high) {
            int mid = low + (high - low) / 2; // Avoids potential overflow compared to (low + high) / 2

            if (nums[mid] == target) {
                return mid; // Target found, return its index
            } else if (nums[mid] < target) {
                low = mid + 1; // Target is in the right half
            } else { // nums[mid] > target
                ans = mid; // This mid is a potential insertion point, try to find an even smaller index
                high = mid - 1; // Target is in the left half
            }
        }

        return ans; // Target not found, ans holds the correct insertion point
    }
}
