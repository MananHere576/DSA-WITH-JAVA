class Solution {
    public int maxProfit(int[] prices) {
        int min =prices[0];
        int ndiff=0;
        for (int i=1;i<prices.length;i++) {
            if (prices[i]<min) {
                min=prices[i];
            } else {
                int diff=prices[i]-min;
                if (diff>ndiff) 
                {
                    ndiff=diff;
                }
            }
        }
        return ndiff;
    }
}
