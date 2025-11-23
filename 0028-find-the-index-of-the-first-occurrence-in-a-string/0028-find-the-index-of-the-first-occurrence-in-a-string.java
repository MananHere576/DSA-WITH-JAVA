class Solution{
    public int strStr(String haystack,String needle){
        if(needle.length()==0) return 0;
        int k=0,f=0;
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(k)){
                k++;
                if(k==needle.length()){
                    f=i-k+1;
                    return f;
                }
            }else{
                if(k>0){
                    i=i-k;
                    k=0;
                }
            }
        }
        return -1;
    }
}
