class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int n=startTime.length;
        int meettimesum=0;
        for(int i=0;i<k;i++)
        {
            meettimesum+=(endTime[i]-startTime[i]);
        }
        if(k==n)
        return eventTime-meettimesum;

        int maxftime=startTime[k]-0-meettimesum;
        for(int i=k;i<n;i++)
        {
            meettimesum-= endTime[i-k] - startTime[i-k];
            meettimesum+= endTime[i] - startTime[i];

            int left = endTime[i-k], right= ((i+1 == n)? eventTime : startTime[i+1]);
            maxftime= Math.max(maxftime, right-left-meettimesum);

        }
        return maxftime;
    }
}