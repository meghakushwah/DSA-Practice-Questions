class Solution {

    public ArrayList<Integer> Ancestors(Node root, int target) 
    {
        // add your code here
        ArrayList<Integer> result = new ArrayList<>();
        dfsHelper(root, result, target);
        return result;
    }
    
    private boolean dfsHelper(Node node, ArrayList<Integer> result, int target) 
    { 
        if(node==null) return false;
        
        if(node.data==target)
        {
            return true;
        }
        if(dfsHelper(node.left, result, target) || dfsHelper(node.right, result, target)) 
        {
            result.add(node.data);
            return true;
        }
        return false;
    }
}
