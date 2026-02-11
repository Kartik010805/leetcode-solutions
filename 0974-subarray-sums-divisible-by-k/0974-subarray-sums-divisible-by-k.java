class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int ps=0;
        int count=0;
        map.put(0,1);
        for(int num:nums){
            ps+=num;
            int r=ps%k;
            if(r<0){
                r=r+k;
            }
            if(map.containsKey(r)){
                count+=map.get(r);
            }
            map.put(r,map.getOrDefault(r,0)+1);
        }
        return count;
    }
}