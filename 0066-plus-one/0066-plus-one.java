class Solution {
    public int[] plusOne(int[] digits) {
         int n = digits.length;

        // Traverse from the last digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;   // just add one
                return digits; // return directly if no carry
            }
            digits[i] = 0; // if digit is 9, set to 0 and continue carry
        }

        // If all digits were 9
        int[] result = new int[n + 1];
        result[0] = 1; // e.g. 999 -> 1000
        return result;
    }
}