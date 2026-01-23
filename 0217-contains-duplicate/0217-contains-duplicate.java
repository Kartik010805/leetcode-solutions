class Solution {
    public boolean containsDuplicate(int[] nums) {
         HashMap<Integer,Integer>map=new HashMap<>();
         for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
         }
         for(int j=0;j<nums.length;j++){
            if(map.get(nums[j])>1){
                return true;
            }
         }
         return false;
    }
}