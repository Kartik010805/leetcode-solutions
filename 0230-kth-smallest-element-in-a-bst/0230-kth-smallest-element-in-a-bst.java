/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> asc=new Stack<>();
        List<Integer> list=new ArrayList<>();
        pushleft(root,asc);
        
        while(!asc.isEmpty()){
            smallest(asc,list);
        }
        return list.get(k-1);
    }
    public void pushleft(TreeNode root,Stack<TreeNode> st){
        while(root !=null){
            st.push(root);
            root=root.left;
        }
    }
    public void smallest(Stack<TreeNode> st,List<Integer>list){
        
        TreeNode node=st.pop();
        list.add(node.val);
        pushleft(node.right,st);
        
    }
}