class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>result=new ArrayList<>();
        func("",result,0,0,n);
        return result;
    }
    private void func(String temp,List<String> result,int open,int close,int n){
        if(open==n && close==n){
            result.add(temp);
            return;
        }
        if(open<n){
            func(temp+"(",result,open+1,close,n);
        }
        if(close<open){
            func(temp+")",result,open,close+1,n);
        }
    }
}