class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int j=0;j<n;j++){
            if(map.get(nums[j])>n/2){
                return nums[j];
            }
        }
        return -1;
    }
}