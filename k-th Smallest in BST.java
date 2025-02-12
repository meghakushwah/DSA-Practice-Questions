class Solution {
       void inorder(Node root, ArrayList<Integer> ans) {
        if(root!=null) {
            inorder(root.left, ans);
            ans.add(root.data);
            inorder(root.right, ans);
        }
    }
    
    public int kthSmallest(Node root, int k) {
        // Write your code here
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        return ans.size() >= k ? ans.get(k-1) : -1;
    }
}
