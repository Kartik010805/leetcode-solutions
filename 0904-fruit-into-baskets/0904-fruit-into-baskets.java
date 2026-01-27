class Solution {
    public int totalFruit(int[] fruits) {
        HashMap <Integer,Integer>map=new HashMap<>();
        int low=0,res=0;
        for(int high=0;high<fruits.length;high++){
            map.put(fruits[high],map.getOrDefault(fruits[high],0)+1);
            while(map.size()>2){
                int lowFruit=fruits[low];
                map.put(lowFruit,map.get(lowFruit)-1);
                if(map.get(lowFruit)==0){
                    map.remove(lowFruit);
                }
                low++;
            }
            res=Math.max(res,high-low+1);
        }
        return res;
    }
}