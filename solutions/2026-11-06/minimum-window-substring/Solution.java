class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) return "";

        int[] count = new int[128];
        for (char c : t.toCharArray()) count[c]++;

        int required = t.length();
        int minLen = Integer.MAX_VALUE;
        int startIdx = 0;
        int left = 0, right = 0;

        while (right < s.length()) {
            char rChar = s.charAt(right);
            if (count[rChar] > 0) {
                required--;
            }
            count[rChar]--;
            right++;

            while (required == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    startIdx = left;
                }

                char lChar = s.charAt(left);
                count[lChar]++;
                if (count[lChar] > 0) {
                    required++;
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIdx, startIdx + minLen);
    }
}
