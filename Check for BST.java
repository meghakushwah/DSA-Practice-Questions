class Solution {
    boolean isBST(Node root) {
        Node current = root;
        Node prev = null;
        
        while (current != null) {
            if (current.left == null) {
                if (prev != null && current.data <= prev.data) {
                    return false;
                }
                prev = current;
                current = current.right;
            } else {
                Node predecessor = current.left;
                while (predecessor.right != null && predecessor.right != current) {
                    predecessor = predecessor.right;
                }
                
                if (predecessor.right == null) {
                    predecessor.right = current;
                    current = current.left;
                } else {
                    predecessor.right = null;
                    if (prev != null && current.data <= prev.data) {
                        return false;
                    }
                    prev = current;
                    current = current.right;
                }
            }
        }
        
        return true;
    }
}
