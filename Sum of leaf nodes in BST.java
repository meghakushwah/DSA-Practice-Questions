class Solution
{
    static int sum = 0;
    Solution(){
        this.sum = 0;
    }
    public static int sumOfLeafNodes(Node root)
    {
        sumOfLeaf(root);
        return sum;
    }
    public static void sumOfLeaf(Node root){
        if(root==null){
            return ;
        }
        if(root.left==null && root.right==null){
            sum += root.data;
            return ;
        }
        sumOfLeaf(root.left);

        sumOfLeaf(root.right);
    }
}
