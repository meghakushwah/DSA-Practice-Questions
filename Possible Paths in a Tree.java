class DSU {
    int parent[], size[];

    DSU(int n) {
        parent = new int[n + 1];
        size = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    int find(int x) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }

    int unionSets(int a, int b) {
        int root_a = find(a);
        int root_b = find(b);

        int res = size[root_a] * size[root_b];

        if (root_a == root_b) {
            return res;
        }

        if (size[root_a] < size[root_b]) {
            parent[root_a] = root_b;
            size[root_b] += size[root_a];
        } else {
            parent[root_b] = root_a;
            size[root_a] += size[root_b];
        }

        return res;
    }
}

class Solution {
    ArrayList<Integer> maximumWeight(int n, int edges[][], int q, int queries[]) {

        DSU dsu = new DSU(n);

        Arrays.sort(edges, Comparator.comparingInt(a -> a[2]));

        TreeMap<Integer, Integer> map = new TreeMap<>();
        int prevPaths = 0;

        for (int[] edge : edges) {
            int union = dsu.unionSets(edge[0], edge[1]);
            int paths = prevPaths + union;
            map.put(edge[2], paths);
            prevPaths = paths;
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            Map.Entry<Integer, Integer> val = map.floorEntry(queries[i]);
            if (val == null) 
                ans.add(0);
            else 
                ans.add(val.getValue());
        }

        return ans;
    }
}
