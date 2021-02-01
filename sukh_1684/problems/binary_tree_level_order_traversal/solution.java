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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        List<List<Integer>> ret = new ArrayList<>();  //n
        Queue<TreeNode> nodes = new LinkedList<>();   //maximum width

        nodes.add(root);
        int count=0;
        while(!nodes.isEmpty()){        
            int size = nodes.size();
             ret.add(new ArrayList<>());
            for(int i=0;i<size;i++){
               TreeNode node = nodes.remove();
                ret.get(ret.size()-1).add(node.val);
                if(node.left!=null){
                    nodes.add(node.left);
                }
                if(node.right!=null){
                    nodes.add(node.right);
                }
            }
            ;
     
            
        }
        return ret;
    }          //time O(N)- total number of elements
}