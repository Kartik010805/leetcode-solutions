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
    public boolean findTarget(TreeNode root, int k) {
        Stack<TreeNode> asc=new Stack<>();
        Stack<TreeNode> dsc=new Stack<>();
        pushleft(root,asc);
        pushright(root,dsc);
        TreeNode i=smallest(asc);
        TreeNode j=largest(dsc);
        while(i!=j){
            int sum=i.val+j.val;
            if(sum==k)return true;
            if(sum<k){
                i=smallest(asc);
            }
            else{
                j=largest(dsc);
            }
        }
        return false;
   }
    public void pushleft(TreeNode root,Stack<TreeNode> st){
        while(root!=null){
            st.push(root);
            root=root.left;
        }
    }
    public void pushright(TreeNode root,Stack<TreeNode>st){
        while(root!=null){
            st.push(root);
            root=root.right;
        }
    }
    public TreeNode smallest(Stack<TreeNode>st){
        TreeNode node=st.pop();
        pushleft(node.right,st);
        return node;
    }
     public TreeNode largest(Stack<TreeNode>st){
        TreeNode node=st.pop();
        pushright(node.left,st);
        return node;
}}