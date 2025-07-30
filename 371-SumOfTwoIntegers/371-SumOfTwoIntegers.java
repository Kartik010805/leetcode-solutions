// Last updated: 7/31/2025, 12:52:11 AM
class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1; // Calculate carry
            a = a ^ b;                // Sum without carry
            b = carry;                // Next carry
        }
        return a;
    }
}