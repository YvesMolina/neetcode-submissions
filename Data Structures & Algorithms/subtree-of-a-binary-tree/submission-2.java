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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null || subRoot == null){
            return false;
        }
        boolean res = false;
        if(root.val == subRoot.val){
            res = dfs(root, subRoot);
        }
        boolean left = isSubtree(root.left, subRoot);
        boolean right = isSubtree(root.right, subRoot);
        return res || left || right;
    }
    public boolean dfs(TreeNode rootNode, TreeNode subRoot){
        if(rootNode == null && subRoot == null){
            return true;
        }
        if(rootNode != null && subRoot != null && rootNode.val == subRoot.val){
            return dfs(rootNode.left, subRoot.left) && dfs(rootNode.right, subRoot.right);
        } else {
            return false;
        }
    }
}
