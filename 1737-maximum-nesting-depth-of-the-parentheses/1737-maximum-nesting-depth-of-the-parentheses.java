class Solution {
    public int maxDepth(String s) {
        int cnt = 0;
        int depth = 0;

        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) == '(') cnt++;
            if(s.charAt(i) == ')') cnt--;

            depth = Math.max(depth, cnt);
        }

        return depth;
    }
}