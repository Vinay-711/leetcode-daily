import java.util.*;

class Solution {
    private static class State {
        String board;
        String hand;
        int step;

        State(String board, String hand, int step) {
            this.board = board;
            this.hand = hand;
            this.step = step;
        }
    }

    public int findMinStep(String board, String hand) {
        String sortedHand = sortHand(hand);
        Queue<State> queue = new ArrayDeque<>();
        Set<String> visited = new HashSet<>();

        State start = new State(board, sortedHand, 0);
        queue.add(start);
        visited.add(board + "#" + sortedHand);

        while (!queue.isEmpty()) {
            State curr = queue.poll();

            Set<Character> uniqueColors = new HashSet<>();
            for (int i = 0; i < curr.hand.length(); i++) {
                uniqueColors.add(curr.hand.charAt(i));
            }

            for (char c : uniqueColors) {
                String nextHand = removeChar(curr.hand, c);
                int n = curr.board.length();
                for (int i = 0; i <= n; i++) {
                    boolean isValid = (i < n && curr.board.charAt(i) == c) || (i > 0 && curr.board.charAt(i - 1) == c);
                    if (isValid) {
                        String newBoard = curr.board.substring(0, i) + c + curr.board.substring(i);
                        String reducedBoard = reduce(newBoard);
                        if (reducedBoard.isEmpty()) {
                            return curr.step + 1;
                        }
                        String key = reducedBoard + "#" + nextHand;
                        if (visited.add(key)) {
                            queue.add(new State(reducedBoard, nextHand, curr.step + 1));
                        }
                    }
                }
            }
        }

        return -1;
    }

    private String sortHand(String hand) {
        char[] chars = hand.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    private String removeChar(String hand, char c) {
        int idx = hand.indexOf(c);
        return hand.substring(0, idx) + hand.substring(idx + 1);
    }

    private String reduce(String s) {
        boolean changed = true;
        while (changed) {
            changed = false;
            int n = s.length();
            for (int i = 0; i < n; ) {
                int j = i;
                while (j < n && s.charAt(j) == s.charAt(i)) {
                    j++;
                }
                if (j - i >= 3) {
                    s = s.substring(0, i) + s.substring(j);
                    changed = true;
                    break;
                } else {
                    i = j;
                }
            }
        }
        return s;
    }
}