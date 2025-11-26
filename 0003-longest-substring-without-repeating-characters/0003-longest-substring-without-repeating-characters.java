class Solution {
    public int lengthOfLongestSubstring(String s) {
        int f=0,max=0;
        for(int i=0;i<s.length();i++)
        {
            Set<Character> set=new HashSet<>();
            f=0;
            for(int j=i;j<s.length();j++)
            {
                char ch=s.charAt(j);
                if(!set.contains(ch))
                {
                    set.add(ch);
                    f++;
                }
                else
                    break;
            }
            if(max<f)
                max=f;
        }
        return max;
    }
}
