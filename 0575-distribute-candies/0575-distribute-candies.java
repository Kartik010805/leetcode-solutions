class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        HashSet<Integer> map=new HashSet<>();
        for(int i:candyType){
            map.add(i);
        }
        return Math.min(map.size(),n/2);
    }
}