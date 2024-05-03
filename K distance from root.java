class Tree
{
     ArrayList<Integer> Kdistance(Node root, int k)
     {
          ArrayList<Integer> ans = new ArrayList<>();
          int dist = 0;
          find(root, k, dist, ans);
          return ans;
     }
     public void find(Node root, int k, int dist, ArrayList<Integer> ans){
        if(root == null)return;
        if(k == dist){
            ans.add(root.data);
            return;
        }
        dist++;
        find(root.left, k, dist, ans);
        find(root.right, k, dist, ans);
     }
}
