class Solution {
    public String largestOddNumber(String num) {
        String[] s = num.split("");
        StringBuilder ns = new StringBuilder();
        for (int i=s.length-1;i>=0;i--) 
        {
            int x = Integer.parseInt(s[i]);
            if (x%2!=0) 
            {
                for(int j=0;j<=i;j++) 
                {
                    ns.append(s[j]);
                }
                break;
            }
        }
        return ns.toString();
    }
}
