class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String a = strs[0];
        for(int i=1;i<strs.length;i++)
        {
            while (strs[i].indexOf(a)!=0) 
            {
                a=a.substring(0,a.length()-1);
                if (a.isEmpty()) 
                return "";
            }
        }
        return a;
    }
}