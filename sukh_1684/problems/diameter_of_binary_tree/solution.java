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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> nodes = new LinkedList<>();
        HashMap<TreeNode,Integer> a = new HashMap<TreeNode,Integer>();
        nodes.add(root);
        int diameter=0;
        while(!nodes.isEmpty()){
            TreeNode node = nodes.remove();
            int left=-1;
            int right=-1;
     
            if(node.left!=null){
                if(a.containsKey(node.left)){
                    left=a.get(node.left);
                }
                else{
                    left = depth(node.left);
                    nodes.add(node.left);

                }
            }
         if(node.right!=null){
                if(a.containsKey(node.right)){
                    right=a.get(node.right);
                }
                else{
                    right = depth(node.right);
                    nodes.add(node.right);
                }
            }
            a.put(node,Math.max(left,right)+1);
            diameter = Math.max(diameter,left+right+2);
        }
        
     return diameter;
    }
    
    
    
    
    public int depth(TreeNode root){
        if(root==null){
            return -1;
        }
        int l = depth(root.left);
        int r = depth(root.right);
        return Math.max(l,r)+1;
    }
    
}
    
