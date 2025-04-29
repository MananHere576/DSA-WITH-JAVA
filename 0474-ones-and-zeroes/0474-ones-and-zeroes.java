class Solution 
{
    public int findMaxForm(String[] strs, int m, int n) 
    {
        int dp[][] = new int[m+1][n+1];
        int x = strs.length;
        for(int i=0;i<x;i++) 
        {
            int a=0,b=0; 
            char ch[] = strs[i].toCharArray();
            for (int j=0;j<ch.length;j++) 
            {
                if(ch[j] == '0')
                    a++;
                else
                    b++;
            }
            for(int j=m;j>=a;j--) 
            {
                for(int k=n;k>=b;k--) 
                {
                    dp[j][k] = Math.max(dp[j][k],1+dp[j-a][k-b]);
                }
            }
        }
        return dp[m][n];
    }
}
