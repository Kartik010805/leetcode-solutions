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
    public int maxPathSum(TreeNode root) {
        int[] maxValue = new int[1];           // acts as global variable
        maxValue[0] = Integer.MIN_VALUE;       // important for all-negative trees

        maxPathDown(root, maxValue);
        return maxValue[0];
    }

    // Helper function
    private int maxPathDown(TreeNode node, int[] maxValue) {
        // base case
        if (node == null) return 0;

        // get max path from left & right subtrees
        int left = Math.max(0, maxPathDown(node.left, maxValue));
        int right = Math.max(0, maxPathDown(node.right, maxValue));

        // update global maximum path sum
        maxValue[0] = Math.max(maxValue[0], left + right + node.val);

        // return max single path (cannot split)
        return Math.max(left, right) + node.val;
    }
}