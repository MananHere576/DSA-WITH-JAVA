class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int d=0;
        long max=0;
        int val=0;
        for(int i=happiness.length-1;i>=happiness.length-k;i--){
            val = happiness[i]-d;
            d++;
            if(val>0)
            {
                max=max+val;
            }
        }
        return max;
    }
}