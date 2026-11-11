import java.util.Arrays;

class Solution {

    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int m = nums1.length;
        int n = nums2.length;
        int[] maxResult = new int[k]; // Initialize with all zeros, which is the smallest possible k-digit number

        // Iterate through all possible splits of k digits between nums1 and nums2
        // i: number of digits to take from nums1
        // k - i: number of digits to take from nums2
        // Constraints:
        // 0 <= i <= m (number of digits from nums1 cannot exceed its length)
        // 0 <= k - i <= n (number of digits from nums2 cannot exceed its length)
        // From k - i <= n => i >= k - n
        // From 0 <= i => i >= 0
        // So, i must be in range [max(0, k - n), min(k, m)]
        for (int i = Math.max(0, k - n); i <= Math.min(k, m); i++) {
            int[] sub1 = maxArray(nums1, i);
            int[] sub2 = maxArray(nums2, k - i);
            int[] merged = merge(sub1, sub2);

            // Compare the current merged result with the overall maximum result found so far
            if (isGreater(merged, 0, maxResult, 0)) {
                maxResult = merged;
            }
        }

        return maxResult;
    }

    /**
     * Finds the maximum number of 'length' digits from 'nums' while preserving relative order.
     * This uses a monotonic stack-like approach.
     *
     * @param nums   The array of digits to pick from.
     * @param length The desired number of digits to pick.
     * @return An array of 'length' digits representing the maximum number.
     */
    private int[] maxArray(int[] nums, int length) {
        if (length == 0) {
            return new int[0];
        }

        int[] result = new int[length];
        int currentIdx = 0; // Pointer for the result array, acts as stack top

        // Number of digits we are allowed to drop from 'nums'
        int drop = nums.length - length;

        for (int num : nums) {
            // While there are digits to drop, and the result array is not empty,
            // and the current digit 'num' is greater than the last digit in 'result':
            // Pop the last digit from 'result' (effectively dropping a smaller digit)
            while (currentIdx > 0 && result[currentIdx - 1] < num && drop > 0) {
                currentIdx--;
                drop--;
            }
            // If the result array is not yet full, add the current digit
            if (currentIdx < length) {
                result[currentIdx++] = num;
            } else {
                // If the result array is already full (currentIdx == length),
                // and we couldn't pop (because num was not greater or drop was 0),
                // we must drop the current 'num' to maintain the 'length' constraint.
                drop--;
            }
        }
        return result;
    }

    /**
     * Merges two arrays of digits to form the largest possible number.
     * This is a greedy merge, comparing suffixes to decide which digit to pick next.
     *
     * @param nums1 The first array of digits.
     * @param nums2 The second array of digits.
     * @return A new array representing the merged maximum number.
     */
    private int[] merge(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        if (len1 == 0) return nums2;
        if (len2 == 0) return nums1;

        int[] result = new int[len1 + len2];
        int p1 = 0, p2 = 0, k = 0; // Pointers for nums1, nums2, and result respectively

        while (p1 < len1 || p2 < len2) {
            // Decide which digit to pick next by comparing the remaining suffixes
            if (isGreater(nums1, p1, nums2, p2)) {
                result[k++] = nums1[p1++];
            } else {
                result[k++] = nums2[p2++];
            }
        }
        return result;
    }

    /**
     * Compares two arrays (or their suffixes starting from given indices) lexicographically.
     *
     * @param nums1 The first array.
     * @param i     Starting index for the first array.
     * @param nums2 The second array.
     * @param j     Starting index for the second array.
     * @return True if nums1[i...] is lexicographically greater than nums2[j...], false otherwise.
     */
    private boolean isGreater(int[] nums1, int i, int[] nums2, int j) {
        // Compare digits one by one as long as they are equal and within bounds
        while (i < nums1.length && j < nums2.length && nums1[i] == nums2[j]) {
            i++;
            j++;
        }
        // After the loop, either:
        // 1. One array is exhausted (or both)
        // 2. We found the first differing digit

        // If nums2 is exhausted first (or at the same time as nums1), nums1 is greater or equal.
        // If nums1 is exhausted first, nums2 is greater.
        // Otherwise, compare the first differing digits: nums1[i] vs nums2[j].
        return j == nums2.length || (i < nums1.length && nums1[i] > nums2[j]);
    }
}