class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
         if(root == null) return false;
    
        targetSum -= root.val;
        if(targetSum == 0) {
        if(root.right == null && root.left == null) {
            return true;
        }
    }
    
    return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }
}
