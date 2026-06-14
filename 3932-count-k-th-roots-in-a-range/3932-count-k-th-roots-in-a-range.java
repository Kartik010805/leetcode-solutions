class Solution {
    public int countKthRoots(int l, int r, int k) {
        return (int)(count(r, k) - count((long)l - 1, k));
    }

    private long count(long n, int k) {
        if (n < 0) return 0;

        long lo = 0, hi = n, ans = 0;

        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;

            if (powerLE(mid, k, n)) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        // +1 because roots are 0,1,2,...,ans
        return ans + 1;
    }

    private boolean powerLE(long base, int exp, long limit) {
        if (base == 0) return true;

        long result = 1;

        for (int i = 0; i < exp; i++) {
            if (result > limit / base) return false;
            result *= base;
        }

        return true;
    }
}