/* ==============================================================================
 * Platform: LeetCode
 * Language: Java
 * URL: https://leetcode.com/problems/remove-element/
 * Generated: 2026-11-05 00:56:05
 *
 * Approach:
 * This solution uses a two-pointer approach. One pointer, `k`, tracks the position where the next non-`val` element should be placed. It also serves as the count of elements not equal to `val`. The other pointer, `i`, iterates through the entire array. If `nums[i]` is not equal to `val`, it means we want to keep this element. We then place `nums[i]` at `nums[k]` and increment `k`. If `nums[i]` is equal to `val`, we simply skip it, effectively 'removing' it by not copying it to the front of the array. After iterating through all elements, `k` will hold the total count of elements not equal to `val`, and the first `k` elements of `nums` will contain these desired values. This approach modifies the array in-place.Time complexity is O(N) because we iterate through the array once. Space complexity is O(1) as we only use a few extra variables for pointers.
 * ==============================================================================
 */

class Solution {public int removeElement(int[] nums, int val) {int k = 0;for (int i = 0; i < nums.length; i++) {if (nums[i] != val) {nums[k] = nums[i];k++;}}return k;}}
