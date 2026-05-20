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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       List<List<Integer>> ans = new LinkedList<>();
       Queue<TreeNode> queue = new LinkedList<>();
       boolean flag = true;

       if(root == null) return ans;

       queue.offer(root);

       while(!queue.isEmpty()) {

            int levelnum = queue.size();

            LinkedList<Integer> list = new LinkedList<>();

            for(int i = 0; i < levelnum; i++) {

                if(flag){
                    list.addLast(queue.peek().val);
                }else{
                    list.addFirst(queue.peek().val);
                }

                if(queue.peek().left != null)
                    queue.offer(queue.peek().left);

                if(queue.peek().right != null)
                    queue.offer(queue.peek().right);

                queue.poll();
            }

            ans.add(list);

            flag = !flag;
        }

        return ans;
    }
}