class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // points to the next position to write a non-val number

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // overwrite the element at k
                k++;
            }
        }

        return k;
    }
}