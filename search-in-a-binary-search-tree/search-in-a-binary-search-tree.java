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
    public TreeNode searchBST(TreeNode root, int val) {
       
        return bfs(root, val);
        
    }
    
    public TreeNode bfs(TreeNode root, int val) {
        
        if (root == null) return null;
        
        if (root.val == val)
            return new TreeNode(val, root.left, root.right);
        
        if (root.val < val) return bfs(root.right, val);
        if (root.val > val) return bfs(root.left, val);
        
        return root;
        
    }
    
}