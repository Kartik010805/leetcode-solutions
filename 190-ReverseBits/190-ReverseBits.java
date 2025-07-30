// Last updated: 7/31/2025, 12:52:18 AM
class Solution {
    public int reverseBits(int n) {
        int result = 0;
    for (int i = 0; i < 32; i++) {
        result <<= 1;         // shift result to the left
        result |= (n & 1);    // copy the last bit of n to result
        n >>= 1;              // shift n to the right
    }
    return result;
    }
}