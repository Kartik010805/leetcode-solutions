class Solution {
    public boolean checkIfPangram(String sentence) {
        int [] arr= new int[26];
        Arrays.fill(arr,0);
        for(int i=0;i<sentence.length();i++){
            arr[sentence.charAt(i)-'a']=1;
        }
        for(int i=0;i<26;i++){
            if(arr[i]==0)return false;
        }
        return true;
    }
}