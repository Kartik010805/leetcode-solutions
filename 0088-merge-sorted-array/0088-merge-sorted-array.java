class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       
      int p1 = m - 1; // Pointer for nums1 (last element of the initial part)
        int p2 = n - 1; // Pointer for nums2 (last element)
        int write_p = m + n - 1; // Pointer for where to write in nums1

        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[write_p] = nums1[p1];
                p1--;
            } else {
                nums1[write_p] = nums2[p2];
                p2--;
            }
            write_p--;
        }
        
    }
}