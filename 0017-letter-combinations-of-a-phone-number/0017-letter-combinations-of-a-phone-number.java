class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        if(digits.length()==0) return result;
        HashMap<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        func(0,digits,"",result,map);
        return result;
    }
    public void func(int idx,String digits,String temp,List<String>result,HashMap<Character,String> map){
        if(idx==digits.length()){
            result.add(temp);
            return;
        }
        String letters=map.get(digits.charAt(idx));
        for (char letter : letters.toCharArray()) {
            func(idx+1,digits, temp+ letter, result, map);
        }
    }
}