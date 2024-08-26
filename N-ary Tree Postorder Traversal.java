class Solution {
    List<Integer> ans=new ArrayList<>();
    public List<Integer> postorder(Node root) {

        if(root==null){
            return ans;
        }

        for(Node node : root.children){
            postorder(node);
        }

        ans.add(root.val);
        return ans;
    }
}
