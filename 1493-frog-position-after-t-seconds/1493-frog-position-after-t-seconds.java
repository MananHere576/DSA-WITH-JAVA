import java.util.*;

class Solution {
    public double frogPosition(int n, int[][] e, int t, int x) {
        Map<Integer, List<Integer>> g = EdgeListToTree.buildGraph(e);
        boolean[] vis = new boolean[n + 1];
        return dfs(1, t, x, vis ,g , 1.0);
    }
    private double dfs(int u, int t, int x, boolean[] vis, Map<Integer, List<Integer>> g, double p) {
        vis[u] = true;
        if (t == 0 || !g.containsKey(u) || allVisited(g.get(u), vis)) return u == x ? p : 0.0;

        List<Integer> nei = g.get(u);
        int cnt = 0;
        for (int v : nei) if (!vis[v]) cnt++;

        for (int v : nei) {
            if (!vis[v]) {
                double res = dfs(v, t - 1, x, vis, g, p / cnt);
                if (res > 0) return res;
            }
        }
        return 0.0;
    }

    private boolean allVisited(List<Integer> list, boolean[] vis) {
        for (int v : list) if (!vis[v]) return false;
        return true;
    }
}

class TreeNode {
    int val;
    List<TreeNode> ch;
    TreeNode(int val) {
        this.val = val;
        this.ch = new ArrayList<>();
    }
}

class EdgeListToTree {
    public static Map<Integer, List<Integer>> buildGraph(int[][] e) {
        Map<Integer, List<Integer>> g = new HashMap<>();
        for (int[] ed : e) {
            int u = ed[0], v = ed[1];
            g.putIfAbsent(u, new ArrayList<>());
            g.putIfAbsent(v, new ArrayList<>());
            g.get(u).add(v);
            g.get(v).add(u);
        }
        return g;
    }
}
