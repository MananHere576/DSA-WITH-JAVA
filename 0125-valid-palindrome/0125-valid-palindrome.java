class Solution {
    public boolean isPalindrome(String s) {
        int i=0,j=0;
        int n=s.length();
        if(n==1)return true;
        if(n==0)return false;
        String cs=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        n=cs.length();
        if(n==0)return true;
        if(n%2==0){
            for(i=0,j=n-1;i<j;i++,j--){
                if(cs.charAt(i)!=cs.charAt(j))return false;
            }
        }else{
            for(i=0,j=n-1;i<j;i++,j--){
                if(cs.charAt(i)!=cs.charAt(j))return false;
            }
        }
        return true;
    }
}
