class Solution {
    public int[] shortestPath(int[][] edges,int n,int m ,int src) {
        // Code here
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++)
            graph.add(new ArrayList<>());
        
        for(int i=0;i<m;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }    
        
        int[] res = new int[n];
        Arrays.fill(res,-1);
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        res[src] = 0;
        q.add(src);
        visited.add(src);
        
        int currLevel = 1;
        while(!q.isEmpty()){
            int sz = q.size();
            for(int i=0;i<sz;i++){
                int curr = q.remove();
                for(int node:graph.get(curr)){
                    if(!visited.contains(node)){
                        res[node] = currLevel;
                        q.add(node);
                        visited.add(node);
                    }
                }
            }
            currLevel++;
        }
        return res;
        
    }
    
}
