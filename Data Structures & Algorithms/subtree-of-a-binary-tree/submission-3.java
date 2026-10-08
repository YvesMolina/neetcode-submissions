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
        if(root == null){
            return false;
        }
        boolean res = false;
        if(dfs(root, subRoot)){
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
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
