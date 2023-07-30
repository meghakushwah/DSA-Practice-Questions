class Solution {
    ArrayList<TreeNode> arr=new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        if(root==null) return null;
        inorder(root);
        for(int i=0;i<arr.size()-1;i++){
            arr.get(i).right=arr.get(i+1);
            arr.get(i).left=null;
        }
        arr.get(arr.size()-1).left=null;
        arr.get(arr.size()-1).right=null;
        return arr.get(0);
    }
    void inorder(TreeNode node){
        if(node==null) return;
        inorder(node.left);
        arr.add(node);
        inorder(node.right);  
    }
}
