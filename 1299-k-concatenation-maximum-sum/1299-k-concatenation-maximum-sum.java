class Solution {
    public int kConcatenationMaxSum(int[] arr, int k) {
        long sum=0l,min=0l,max=0l;
        int mod=(int)1e9+7;
        for(int i=0;i<k && i<2;i++){
            for(int ele:arr){
                sum+=ele;
                max=Math.max(max,sum-min);
                min=Math.min(min,sum);
            }
        }
        max+=((k<2)?0l:((k-2)*(sum>0?(sum>>1):0)));    
        return (int)(max%mod);
    }
}