/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode ans=null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        func(root,p,q);
        return ans;
    }
    public int func(TreeNode root,TreeNode p,TreeNode q){
        if(root==null) return 0;
        int left=func(root.left,p,q);
        int right=func(root.right,p,q);
        int self=0;
        if(root==p || root==q) self=1;
        int total=self+left+right;
        if(total>=2 && ans==null) ans=root;
        return total;
    }
    
}