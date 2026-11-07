import java.util.*;

class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Set<String> dict = new HashSet<>(wordList);
        List<List<String>> results = new ArrayList<>();
        if (!dict.contains(endWord)) return results;

        Map<String, List<String>> adj = new HashMap<>();
        Map<String, Integer> distance = new HashMap<>();
        
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        distance.put(beginWord, 0);
        
        boolean found = false;
        while (!queue.isEmpty()) {
            int size = queue.size();
            Set<String> levelVisited = new HashSet<>();
            for (int i = 0; i < size; i++) {
                String curr = queue.poll();
                int d = distance.get(curr);
                List<String> neighbors = getNeighbors(curr, dict);
                for (String neighbor : neighbors) {
                    if (!distance.containsKey(neighbor)) {
                        distance.put(neighbor, d + 1);
                        queue.offer(neighbor);
                        levelVisited.add(neighbor);
                    }
                    if (distance.get(neighbor) == d + 1) {
                        adj.computeIfAbsent(curr, k -> new ArrayList<>()).add(neighbor);
                    }
                    if (neighbor.equals(endWord)) found = true;
                }
            }
            if (found) break;
        }

        if (!found) return results;
        List<String> path = new ArrayList<>();
        path.add(beginWord);
        dfs(beginWord, endWord, adj, path, results);
        return results;
    }

    private List<String> getNeighbors(String word, Set<String> dict) {
        List<String> neighbors = new ArrayList<>();
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char old = chars[i];
            for (char c = 'a'; c <= 'z'; c++) {
                if (c == old) continue;
                chars[i] = c;
                String next = new String(chars);
                if (dict.contains(next)) neighbors.add(next);
            }
            chars[i] = old;
        }
        return neighbors;
    }

    private void dfs(String curr, String end, Map<String, List<String>> adj, List<String> path, List<List<String>> results) {
        if (curr.equals(end)) {
            results.add(new ArrayList<>(path));
            return;
        }
        if (!adj.containsKey(curr)) return;
        for (String neighbor : adj.get(curr)) {
            path.add(neighbor);
            dfs(neighbor, end, adj, path, results);
            path.remove(path.size() - 1);
        }
    }
}