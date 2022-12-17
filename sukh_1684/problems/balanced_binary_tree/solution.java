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
    class myRef{
        boolean a;
        myRef(boolean a){
            this.a=a;
        }
    }
    public boolean isBalanced(TreeNode root) {
    
        myRef temp = new myRef(true);
        depth(root,temp);
        return temp.a;
    }
    
    private int depth(TreeNode current,myRef a){
        if(current==null){
            return -1;
        }
        
        int left=depth(current.left,a);
        int  right= depth(current.right,a);
        if(Math.abs(left-right)>1){
            a.a=false;
        }
        return Math.max(left,right)+1;
    }

}