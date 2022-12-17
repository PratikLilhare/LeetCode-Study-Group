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
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode node =null;
        return helper(node,nums,0,nums.length-1);
    }
    private TreeNode helper(TreeNode current, int[] nums, int left, int right){
        if(left>right){
            return null;}
        
            int middle = left+ (right-left)/2;
            if(current==null){
                current = new TreeNode(nums[middle]);
            }
            current.left=helper(current.left,nums,left,middle-1);
            current.right=helper(current.right,nums,middle+1,right);
        
        return current;
    }
}