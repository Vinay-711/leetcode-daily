import java.util.*;

class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> result = new ArrayList<>();
        if (words == null || words.length == 0) {
            return result;
        }

        Arrays.sort(words, (a, b) -> Integer.compare(a.length(), b.length()));
        Set<String> dict = new HashSet<>();

        for (String word : words) {
            if (canForm(word, dict)) {
                result.add(word);
            }
            dict.add(word);
        }

        return result;
    }

    private boolean canForm(String word, Set<String> dict) {
        if (dict.isEmpty()) {
            return false;
        }
        int n = word.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;

        for (int i = 0; i < n; i++) {
            if (!dp[i]) {
                continue;
            }
            for (int j = i + 1; j <= n; j++) {
                if (dict.contains(word.substring(i, j))) {
                    dp[j] = true;
                    if (dp[n]) {
                        return true;
                    }
                }
            }
        }

        return dp[n];
    }
}