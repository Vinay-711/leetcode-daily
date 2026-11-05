/* ==============================================================================
 * Platform: LeetCode
 * Language: Java
 * URL: https://leetcode.com/problems/climbing-stairs/
 * Generated: 2026-11-05 11:13:05
 *
 * Approach:
 * This problem can be solved using dynamic programming, equivalent to computing the Fibonacci sequence. To reach step n, one can arrive either from step (n-1) with 1 step or step (n-2) with 2 steps. Therefore, the total number of ways to reach step n is f(n) = f(n-1) + f(n-2). We can iteratively update two variables to store previous states, giving O(n) time complexity and O(1) space complexity.
 * ==============================================================================
 */

class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int prev2 = 1;
        int prev1 = 2;
        int current = 0;
        for (int i = 3; i <= n; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return current;
    }
}
