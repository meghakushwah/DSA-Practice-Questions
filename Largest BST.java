class Solution {
    static class BSTInfo {
        boolean isBST;
        int size;
        int minVal;
        int maxVal;
        
        BSTInfo(boolean isBST, int size, int minVal, int maxVal) {
            this.isBST = isBST;
            this.size = size;
            this.minVal = minVal;
            this.maxVal = maxVal;
        }
    }
    
    static int largestBst(Node root) {
        if (root == null) return 0;
        BSTInfo result = largestBstHelper(root);
        return result.size;
    }
    
    static BSTInfo largestBstHelper(Node root) {

        if (root == null) {
            return new BSTInfo(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        
      
        BSTInfo leftInfo = largestBstHelper(root.left);
        BSTInfo rightInfo = largestBstHelper(root.right);
        
        BSTInfo current = new BSTInfo(false, 0, 0, 0);
     
        if (leftInfo.isBST && rightInfo.isBST && root.data > leftInfo.maxVal && root.data < rightInfo.minVal) {
            current.isBST = true;
            current.size = 1 + leftInfo.size + rightInfo.size;
            current.minVal = Math.min(root.data, leftInfo.minVal);
            current.maxVal = Math.max(root.data, rightInfo.maxVal);
        } else {
            current.size = Math.max(leftInfo.size, rightInfo.size);
        }
        
        return current;
    }
}
