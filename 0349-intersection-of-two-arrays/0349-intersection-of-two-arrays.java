class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set= new HashSet<>();
        int[]res=new int[Math.min(nums1.length,nums2.length)];
        for(int i:nums1){
            set.add(i);
        }
           int idx=0;
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
             
                res[idx++]=nums2[i];
                set.remove(nums2[i]); 
            }
        }
        return Arrays.copyOfRange(res, 0, idx);
    }
}