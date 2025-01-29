class Solution {
    public int check(int res[],ArrayList<ArrayList<Integer>>adj,int src ,boolean visit[])
    {
        visit[src]=true;

        int count=0;
        for(int node:adj.get(src))
        {
            if(visit[node]==false)
            {
                count+=1+check(res,adj,node,visit);
            }
        }
        return count ;
    }
    public int[] findRedundantConnection(int[][] edges) 
    {
        int res[]=new int[2];
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<=edges.length;i++)
        adj.add(new ArrayList<>());
        for(int e[]:edges)
        {
            int s=e[0];
            int end=e[1];
            adj.get(s).add(end);
            adj.get(end).add(s);
        }
        for(int i=1;i<=edges.length;i++)
        {
            int s=edges[edges.length-i][0];
            int e=edges[edges.length-i][1];
            adj.get(s).remove(Integer.valueOf(e));
            adj.get(e).remove(Integer.valueOf(s));
            boolean visit[]=new boolean[edges.length+1];
            int count=check(res,adj,1,visit);
            if(count ==edges.length-1)
            {
                res[0]=s;
                res[1]=e;
                return res;
            }
            adj.get(s).add(e);
            adj.get(e).add(s);
        }
        return res;
    }
}
