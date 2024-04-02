class Solution
{
    void inorder(Node root, ArrayList<Integer> in)
    {
        if(root != null) 
        {
            inorder(root.left, in);
            in.add(root.data);
            inorder(root.right, in);
        }
    }

    int absolute_diff(Node root)
    {
        ArrayList<Integer> in = new ArrayList<>();
        inorder(root, in);
        
        int mini = Integer.MAX_VALUE;
        for(int i = 0; i < in.size() - 1; i++)
            mini = Math.min(mini, in.get(i + 1) - in.get(i));
            
        return mini;
    }
}
