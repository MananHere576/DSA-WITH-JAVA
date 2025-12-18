class Solution {
    Integer[][] memo;
    final int INF = (int)1e9;

    public int coinChange(int[] coins, int amount) {
        memo = new Integer[coins.length + 1][amount + 1];
        int ans = solve(coins, coins.length, amount);
        return ans >= INF ? -1 : ans;
    }

    private int solve(int[] coins, int n, int amt) {
        if (amt == 0) return 0;
        if (n == 0) return INF;

        if (memo[n][amt] != null) return memo[n][amt];

        int skip = solve(coins, n - 1, amt);

        int take = INF;
        if (coins[n - 1] <= amt)
            take = 1 + solve(coins, n, amt - coins[n - 1]);

        return memo[n][amt] = Math.min(skip, take);
    }
}