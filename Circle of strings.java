class Solution {
    private void DFS(int node, boolean[] visited, List<List<Integer>> adj) {
        visited[node] = true;
        for (int v : adj.get(node)) {
            if (!visited[v]) {
                DFS(v, visited, adj);
            }
        }
    }

    public int isCircle(String arr[]) {
        int[] inDeg = new int[26];
        int[] outDeg = new int[26];
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            adj.add(new ArrayList<>());
        }

        for (String A : arr) {
            int u = A.charAt(0) - 'a';
            int v = A.charAt(A.length() - 1) - 'a';

            adj.get(u).add(v);
            inDeg[v]++;
            outDeg[u]++;
        }
        
        for (int i = 0; i < 26; i++) {
            if (inDeg[i] != outDeg[i]) {
                return 0;  
            }
        }

        boolean[] visited = new boolean[26];
        int node = arr[0].charAt(0) - 'a';
        DFS(node, visited, adj);

        for (int i = 0; i < 26; i++) {
            if (inDeg[i] != 0 && !visited[i]) {
                return 0;  
            }
        }

        return 1;  
    }
}
