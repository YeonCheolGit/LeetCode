class Solution {
    
    int sum = 0;
    int deepestLevel = 0;
    
    public int deepestLeavesSum(TreeNode root) {
        
        if (root == null) {
            return 0;
        }
        
        return dfs(root, 0);
        
    }
    
    private int dfs(TreeNode root, int level) {
        
        if (level > deepestLevel) {
            sum = 0;
            deepestLevel = level;
        }
        
        if (level == deepestLevel) {
            sum += root.val;
        }

        if (root.left != null) {
            dfs(root.left, level+1);
        }
        
        if (root.right != null) {
            dfs(root.right, level+1);
        }

        return sum;
        
    }
}
