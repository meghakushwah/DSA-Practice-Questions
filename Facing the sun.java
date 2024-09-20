class Solution {
    // Returns count buildings that can see sunlight
    public int countBuildings(int[] height) {
        // code here
        Queue<Integer> q=new LinkedList<>();
        q.add(height[0]);
        int c=1;
        for(int i=1;i<height.length;i++)
        {
            if(height[i]>q.peek())
            {
                q.add(height[i]);
                q.remove();
                c++;
            }
        }
        return c;
    }
}
