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
     return helper(root);

        
    }
    private TreeNode helper(TreeNode current){
        if(current==null){
            return null;
        }
       TreeNode node=new TreeNode(current.val);
        node.right=helper(current.left);
        node.left= helper(current.right);
        
        return node;
    }
}