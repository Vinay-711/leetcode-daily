/* ==============================================================================
 * Platform: LeetCode
 * Language: Java
 * URL: https://leetcode.com/problems/sqrtx/
 * Generated: 2026-11-05 11:12:40
 *
 * Approach:
 * We use binary search to find the integer square root of x. Since the answer must be an integer, the candidate values range from 1 to x (handling x = 0 as a special case). In each step of binary search, we check if mid <= x / mid to avoid integer overflow that could occur with mid * mid. If true, mid is a valid potential answer, so we record it and search in the higher half. Otherwise, we search in the lower half. Time complexity is O(log x) and space complexity is O(1).
 * ==============================================================================
 */

class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int low = 1, high = x;
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid <= x / mid) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
