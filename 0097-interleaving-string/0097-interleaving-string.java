class Solution {
    int[][] dp;
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() < s3.length() || 
        s1.length() + s2.length() > s3.length()) return false;

        dp = new int[s1.length()+1][s2.length()+1];
        boolean op1 = helper(s1, s2, s3, 0, 0, true);
        for (int[] row : dp) Arrays.fill(row, 0);
        boolean op2 = helper(s1, s2, s3, 0, 0, false);

        return op1 || op2;
    }

    private boolean helper(String s1, String s2, String s3, int i, int j, boolean isFirst) {
        if (i == s1.length() && j == s2.length()) {
           return true;
        }

        if (dp[i][j] != 0) {
            return dp[i][j] == 1 ? false : true;
        }

        int k = isFirst ? i : j;
        int z = isFirst ? j : i;
        int n = isFirst ? s1.length() : s2.length();
        String s = isFirst ? s1 : s2;

        for (int x = k; x < n; x++) {
            String subS = s.substring(k, x+1);
            if (!s3.substring(k+z, z+x+1).equals(subS)) break;

            if (helper(s1, s2, s3, isFirst ? (x+1) : i, isFirst ? j : (x+1), !isFirst)) {
                dp[i][j] = 2;
                return true;
            } dp[i][j] = 1;
        }

        return false;
    }
}