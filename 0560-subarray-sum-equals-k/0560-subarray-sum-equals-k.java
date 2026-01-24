class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int ps=0;
        int count=0;
        for(int num:nums){
            ps +=num;
            if(map.containsKey(ps-k)){
                count+=map.get(ps-k);
            }
            map.put(ps,map.getOrDefault(ps,0)+1);
        }
        return count;
    }
}