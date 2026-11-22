import java.util.*;

class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        if (s == null || s.length() < 4 || s.length() > 12) return result;
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String s, int index, List<String> parts, List<String> result) {
        if (parts.size() == 4) {
            if (index == s.length()) {
                result.add(String.join(".", parts));
            }
            return;
        }
        int remainingParts = 4 - parts.size();
        int remainingChars = s.length() - index;
        if (remainingChars < remainingParts || remainingChars > remainingParts * 3) {
            return; // prune impossible branch
        }
        for (int len = 1; len <= 3 && index + len <= s.length(); len++) {
            String segment = s.substring(index, index + len);
            if (isValid(segment)) {
                parts.add(segment);
                backtrack(s, index + len, parts, result);
                parts.remove(parts.size() - 1);
            }
        }
    }

    private boolean isValid(String seg) {
        if (seg.length() > 1 && seg.charAt(0) == '0') return false; // leading zero
        int val = Integer.parseInt(seg);
        return val >= 0 && val <= 255;
    }
}