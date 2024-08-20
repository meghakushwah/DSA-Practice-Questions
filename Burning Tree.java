class Solution{
    
    public static int minTime(Node root, int target) {
        
        Map<Node,Node> map=new HashMap<>();
        preorder(root,null,map);
        
        Node tar = findTargetNode(root,target);
        
        Set<Node> vis=new HashSet<>();
        vis.add(tar);
        
        Queue<Node> q=new LinkedList<>();
        q.add(tar);
        
        int level=0;
        
        while(!q.isEmpty()){
            
            int size=q.size();
            for(int i=0;i<size;i++){
                
                Node pop = q.remove();
                Node par=map.get(pop), left=pop.left, right=pop.right;
                
                if(par!=null && !vis.contains(par)){
                    vis.add(par);
                    q.add(par);
                }
                if(left!=null && !vis.contains(left)){
                    vis.add(left);
                    q.add(left);
                }
                if(right!=null && !vis.contains(right)){
                    vis.add(right);
                    q.add(right);
                }
                
            }
            level++;
        }
        return level-1;
    }
    static Node findTargetNode(Node node,int x){
        if(node==null || node.data==x)  return node;
        
        Node left = findTargetNode(node.left,x);
        if(left!=null)  return left;
        
        return findTargetNode(node.right,x);
    }
    
    static void preorder(Node node,Node par,Map<Node,Node> map){
        if(node==null)  return;
        
        map.put(node,par);
        
        preorder(node.left,node,map);
        preorder(node.right,node,map);
    }
    
}
