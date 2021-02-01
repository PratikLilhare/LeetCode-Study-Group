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
    public boolean isValidBST(TreeNode root) {
        Queue<TreeNode> nodes = new LinkedList<>();
              depth(root,nodes);
        while(nodes.size()>1){
           TreeNode  node1= nodes.remove();
           TreeNode node2= nodes.element();
            if(node2.val<=node1.val){
                return false;
            }
            
        }
            
            
            
            return true;
    }
    private void depth(TreeNode root,Queue<TreeNode> nodes){
        if(root==null){
            return;
        }
        depth(root.left,nodes);
        nodes.add(root);
        depth(root.right,nodes);
    }
    

}