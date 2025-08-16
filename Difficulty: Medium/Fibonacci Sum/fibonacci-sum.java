class Solution {
    static final long MOD = 1_000_000_007L;

    static long fibSum(long N) {
        // Sum F0..FN = F_{N+2} - 1 (mod MOD)
        long fN2 = fib(N + 2);                 // F_{N+2} % MOD
        long ans = (fN2 - 1 + MOD) % MOD;      // ensure non-negative
        return ans;
    }

    // Returns F(n) % MOD using fast doubling
    private static long fib(long n) {
        long[] p = fibPair(n);
        return p[0];
    }

    // Returns {F(n), F(n+1)} % MOD
    private static long[] fibPair(long n) {
        if (n == 0) return new long[]{0, 1};
        long[] ab = fibPair(n >> 1);
        long a = ab[0];        // F(k)
        long b = ab[1];        // F(k+1)

        long twoBminusA = (2 * b % MOD - a + MOD) % MOD;
        long c = (a * twoBminusA) % MOD;                 // F(2k)
        long d = ( (a * a) % MOD + (b * b) % MOD ) % MOD; // F(2k+1)

        if ((n & 1) == 0) return new long[]{c, d};
        return new long[]{d, (c + d) % MOD};
    }
}
