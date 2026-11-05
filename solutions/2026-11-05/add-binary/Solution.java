/* ==============================================================================
 * Platform: LeetCode
 * Language: Java
 * URL: https://leetcode.com/problems/add-binary/
 * Generated: 2026-11-05 01:04:55
 *
 * Approach:
 * The approach simulates manual binary addition from right to left (least significant bit to most significant bit). Two pointers, `i` and `j`, are used to traverse strings `a` and `b` respectively, starting from their last characters. A `carry` variable keeps track of any carry-over from the previous bit addition. In each step, the current bits from `a` and `b` (if available) are added along with the `carry`. The sum's least significant bit (`sum % 2`) is appended to a `StringBuilder`, and the new `carry` is calculated (`sum / 2`). The process continues until both strings are fully traversed and there's no remaining carry. Finally, the `StringBuilder` is reversed to get the correct binary sum and converted to a string. This results in a time complexity of O(max(L1, L2)) and a space complexity of O(max(L1, L2)), where L1 and L2 are the lengths of the input strings.
 * ==============================================================================
 */

import java.util.*;

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            sb.append(sum % 2);
            carry = sum / 2;
        }

        return sb.reverse().toString();
    }
}
