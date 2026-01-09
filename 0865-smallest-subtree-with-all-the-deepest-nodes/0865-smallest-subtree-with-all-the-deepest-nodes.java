/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static class Pair {
        int depth;
        TreeNode node;
        Pair(int d, TreeNode n) { depth = d; node = n; }
    }

    Pair dfs(TreeNode root) {
        if (root == null) return new Pair(0, null);

        Pair L = dfs(root.left);
        Pair R = dfs(root.right);

        if (L.depth > R.depth) return new Pair(L.depth + 1, L.node);
        if (R.depth > L.depth) return new Pair(R.depth + 1, R.node);

        return new Pair(L.depth + 1, root);
    }

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return dfs(root).node;
    }
}

