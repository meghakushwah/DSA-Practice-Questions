class Solution {
    int maxLeft = 0, maxRight = 0;
    public int verticalWidth(Node root) {
        if (root == null) {
            return 0;
        }
        inOrder(root, 0);
        return 1 + maxRight - maxLeft;
    }
    
    public void inOrder(Node root, int pos){
        if (root != null){
            inOrder(root.left, pos - 1);
            if (pos < maxLeft){
                maxLeft = pos;
            } else if (pos > maxRight){
                maxRight = pos;
            }
            inOrder(root.right, pos + 1);
        }
    }
}
