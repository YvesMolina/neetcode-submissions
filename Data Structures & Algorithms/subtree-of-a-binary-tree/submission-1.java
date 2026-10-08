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
        if (root == null && subRoot == null) {
            return true;
        }
        boolean left = false;
        boolean right = false;
        if (root != null && subRoot != null && root.val == subRoot.val){
            if(isSameTree(root, subRoot)){
                return true;
            }
        }
            if(root.left != null){
            left = isSubtree(root.left, subRoot);
            }
            if(root.right != null){
            right = isSubtree(root.right, subRoot);
            }
        
        return left || right;

    }
    public boolean isSameTree(TreeNode node1, TreeNode node2){
        if(node1 == null && node2 == null){
            return true;
        }
        if (node1 != null && node2 != null && node1.val == node2.val){
            return isSameTree(node1.left, node2.left) && isSameTree(node1.right, node2.right);
        } else {
            return false;
        }
    }
}
