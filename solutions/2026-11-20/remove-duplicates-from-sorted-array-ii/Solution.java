import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) return n; // already satisfies condition
        int pos = 2; // next position to write
        for (int i = 2; i < n; i++) {
            // If current number is greater than the number two positions before pos,
            // it means we have not exceeded the allowed two duplicates.
            if (nums[i] != nums[pos - 2]) {
                nums[pos] = nums[i];
                pos++;
            }
        }
        return pos;
    }
}