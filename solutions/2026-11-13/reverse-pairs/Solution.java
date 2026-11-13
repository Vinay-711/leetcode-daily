class Solution {
    private int count = 0;

    public int reversePairs(int[] nums) {
        count = 0; 
        mergeSort(nums, 0, nums.length - 1);
        return count;
    }

    private void mergeSort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = low + (high - low) / 2;

        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);
        
        // Count reverse pairs between the two sorted halves
        countPairs(nums, low, mid, high);
        
        // Merge the two sorted halves back into the original array
        merge(nums, low, mid, high);
    }

    private void countPairs(int[] nums, int low, int mid, int high) {
        int j = mid + 1; // Pointer for the right half
        for (int i = low; i <= mid; i++) {
            // Advance 'j' as long as nums[i] satisfies the condition with nums[j]
            // Use long to prevent overflow when multiplying by 2
            while (j <= high && (long) nums[i] > 2 * (long) nums[j]) {
                j++;
            }
            // All elements from nums[mid+1] to nums[j-1] form a reverse pair with nums[i]
            count += (j - (mid + 1));
        }
    }

    private void merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;       // Pointer for the left half
        int j = mid + 1;   // Pointer for the right half
        int k = 0;         // Pointer for the temporary array

        // Merge elements into temp array in sorted order
        while (i <= mid && j <= high) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        // Copy any remaining elements from the left half
        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        // Copy any remaining elements from the right half
        while (j <= high) {
            temp[k++] = nums[j++];
        }

        // Copy the sorted elements from temp back to the original array
        for (int l = 0; l < temp.length; l++) {
            nums[low + l] = temp[l];
        }
    }
}