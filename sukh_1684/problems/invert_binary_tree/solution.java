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
    public TreeNode invertTree(TreeNode root) {
        return reverse(root);
    }
    private TreeNode reverse(TreeNode root){
       if(root == null){
            return null;
        }
        TreeNode current = new TreeNode(root.val);
        current.left = reverse(root.right);
        current.right = reverse(root.left);
        return current;
    }
}