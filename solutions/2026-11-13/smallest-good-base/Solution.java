import java.util.*;

class Solution {
    public String smallestGoodBase(String n) {
        long N = Long.parseLong(n);
        for (int m = 63; m >= 3; m--) {
            long L = 2;
            long R = (long) Math.pow(N, 1.0 / (m - 1)) + 2;
            while (L <= R) {
                long k = L + (R - L) / 2;
                long sum = 1;
                long cur = 1;
                boolean overflow = false;
                for (int i = 1; i < m; i++) {
                    if (cur > (N - sum) / k) {
                        overflow = true;
                        break;
                    }
                    cur *= k;
                    sum += cur;
                }
                if (overflow || sum > N) {
                    R = k - 1;
                } else if (sum < N) {
                    L = k + 1;
                } else {
                    return String.valueOf(k);
                }
            }
        }
        return String.valueOf(N - 1);
    }
}