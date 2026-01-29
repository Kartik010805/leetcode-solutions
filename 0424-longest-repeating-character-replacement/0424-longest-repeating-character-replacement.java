class Solution { 
    public  static int characterReplacement(String s, int k) {
        
    int r=0;
    int l=0;
    int maxlength=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while (r<s.length()){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            while ((r-l+1)- Collections.max(map.values()) >k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
            }

             maxlength=Math.max(maxlength,r-l+1);
            r++;
        }

        return maxlength;

    }
     
}