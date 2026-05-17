class Solution {
    public int arrangeCoins(int n) {

        long s = 0;
        long e = n;
        int ans = 0;

        while (s <= e) {

            long mid = s + (e - s) / 2;

            long coins = mid * (mid + 1) / 2;

            if (coins <= n) {
                ans = (int) mid;
                s = mid + 1;
            }

            else {
                e = mid - 1;
            }
        }

        return ans;
    }
}