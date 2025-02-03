class Solution {
    // Function to find the height of a binary tree.
    int height(Node node) {
        // code here
        if(node == null) return -1;
        int left=0,right = 0;
        if(node.left != null) left = 1+height(node.left);
        if(node.right != null) right = 1+height(node.right);
        return Math.max(left,right);
    }
}
