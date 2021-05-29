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
        List<Integer> elements = new ArrayList<>();
          depth(root,elements);
        int len = elements.size();
        for(int i=1;i<len;i++){
            if(elements.get(i-1)>=elements.get(i)){
                return false;
            }
        }
        return true;
    }
    private void depth(TreeNode node, List<Integer> elements){
        if(node == null){
            return;
        }
        depth(node.left,elements);
        elements.add(node.val);
        depth(node.right,elements);
    }
}