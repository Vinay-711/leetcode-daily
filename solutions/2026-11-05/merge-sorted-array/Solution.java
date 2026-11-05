/* ==============================================================================
 * Platform: LeetCode
 * Language: Java
 * URL: https://leetcode.com/problems/merge-sorted-array/
 * Generated: 2026-11-05 11:13:29
 *
 * Approach:
 * We use a three-pointer approach, working backwards from the end of both arrays. By placing the larger elements at the back of `nums1` first, we avoid overwriting elements in `nums1` that haven't been compared yet.

Time Complexity: O(m + n) since we iterate through both arrays once.
Space Complexity: O(1) as the merge is done in-place without using extra memory.
 * ==============================================================================
 */

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }
    }
}
