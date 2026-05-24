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
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer>list=new ArrayList<>();
        fun(root,targetSum,list,0);
        return ans;
    }
    public void fun(TreeNode root,int targetSum,List<Integer> list,int sum){
        if(root ==null)return;
        sum+=root.val;
        list.add(root.val);
        if(root.left == null && root.right==null){
            if(sum==targetSum){
                ans.add(new ArrayList<>(list));
                
            }
        }
        fun(root.left,targetSum,list,sum);
        fun(root.right,targetSum,list,sum);
        list.remove(list.size()-1);
    }
}