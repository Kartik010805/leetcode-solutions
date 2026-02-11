class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map =new HashMap<>();
        int ps=0;
        int count =0;
        map.put(0,1);
        for(int num:nums){
            ps+=num;
            if(map.containsKey(ps-goal)){
                count+=map.get(ps-goal);
            }
            map.put(ps,map.getOrDefault(ps,0)+1);
        }
        return count;
    }
}