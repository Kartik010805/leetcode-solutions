class Solution {
    public int[] productExceptSelf(int[] nums) {
        
       int n = nums.length;
        int[] answer = new int[n];
        
        // Step 1: Calculate prefix products
        answer[0] = 1; // prefix product for index 0 is 1
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }
        
        // Step 2: Multiply by suffix products
        int suffixProd = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * suffixProd;
            suffixProd *= nums[i];
        }
        
        return answer;
    }
}