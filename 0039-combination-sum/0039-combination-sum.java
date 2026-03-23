class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>current=new ArrayList<>();
        func(target,0,result,current,candidates);
        return result;
        
    }
    public void func(int target,int idx,List<List<Integer>>result,List<Integer>current,int[]candidates){
        if(target==0){
            result.add (new ArrayList<>(current));
            return;
        }
        if(target<0) return;
        for(int i=idx;i<candidates.length;i++){
            int candidate=candidates[i];
            if(candidate>target){
                continue;
            }
            current.add(candidate);
            func(target-candidate,i,result,current,candidates);
            current.remove(current.size()-1);
        }
    }
}