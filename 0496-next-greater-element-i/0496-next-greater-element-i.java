class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int[] result=new int[n];
        Arrays.fill(result,-1);
        HashMap<Integer,Integer>map=new HashMap<>();
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<n;i++){
            map.put(nums1[i],i);
        }
        for(int i=0;i<nums2.length;i++){
            while(!stack.isEmpty() && nums2[stack.peek()]<nums2[i]){
                 int indexInNums2 = stack.pop();
                int value = nums2[indexInNums2];
                
                int indexInNums1 = map.get(value);
                result[indexInNums1] = nums2[i];

            }
            if(map.containsKey(nums2[i])){
            stack.push(i);
            }
        }
        return result;
    }
}