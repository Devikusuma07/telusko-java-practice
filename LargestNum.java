import java.util.*;

class Solution {

    List<Integer>[] graph;
    int[] parent;
    int[] depth;
    int[] prefixMask;
    char[] chars;

    public List<Boolean> palindromePath(int n, int[][] edges, String s, String[] queries) {

        graph = new ArrayList[n];
        for (int i = 0; i < n; i++)
            graph[i] = new ArrayList<>();

        for (int[] e : edges) {
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }

        chars = s.toCharArray();
        parent = new int[n];
        depth = new int[n];
        prefixMask = new int[n];

        // Build initial tree info
        dfs(0, -1, 0);

        List<Boolean> result = new ArrayList<>();

        for (String q : queries) {

            String[] parts = q.split(" ");

            if (parts[0].equals("update")) {

                int node = Integer.parseInt(parts[1]);
                char newChar = parts[2].charAt(0);

                chars[node] = newChar;

                // Recompute masks
                dfs(0, -1, 0);

            } else { // query

                int u = Integer.parseInt(parts[1]);
                int v = Integer.parseInt(parts[2]);

                int lca = findLCA(u, v);

                int mask = prefixMask[u] ^ prefixMask[v]
                        ^ (1 << (chars[lca] - 'a'));

                result.add((mask & (mask - 1)) == 0);
            }
        }

        return result;
    }

    private void dfs(int node, int par, int mask) {

        parent[node] = par;

        mask ^= (1 << (chars[node] - 'a'));
        prefixMask[node] = mask;

        for (int nei : graph[node]) {
            if (nei != par) {
                depth[nei] = depth[node] + 1;
                dfs(nei, node, mask);
            }
        }
    }

    private int findLCA(int u, int v) {

        while (depth[u] > depth[v])
            u = parent[u];

        while (depth[v] > depth[u])
            v = parent[v];

        while (u != v) {
            u = parent[u];
            v = parent[v];
        }

        return u;
    }
}
