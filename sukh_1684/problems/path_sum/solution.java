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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return depth(root,targetSum,0);
    }
    private boolean depth(TreeNode current,int target,int sum){
        if(current==null){
          return false;
        }
        sum=sum+current.val;
        if(current.left==null && current.right==null && target==sum){
            return true;
        }

        return depth(current.left,target,sum) || depth(current.right,target,sum);
    }
}