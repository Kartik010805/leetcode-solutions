class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Set<Integer> list=new HashSet<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int m=nums.length/3;
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])>m){
                list.add(nums[i]);
            }
        }
        return new ArrayList<>(list);
    }
}