class Solution {
    public List<String> generateParenthesis(int n) 
    {
        List<String> ans = new ArrayList<>();
        generation(ans,"",0,0,n);
        return ans;
    }
    private void generation(List<String> ans,String curr,int open,int close,int max) 
    {
        if (curr.length()==max*2) 
        {
            ans.add(curr);
            return;
        }

        if(open < max) 
        {
            generation(ans,curr+"(",open+1,close,max);
        }
        if(close < open) 
        {
            generation(ans, curr + ")", open, close + 1, max);
        }
    }
}
