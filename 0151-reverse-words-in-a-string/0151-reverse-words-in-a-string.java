class Solution {
    public String reverseWords(String s) {
        StringBuilder Sn = new StringBuilder();
        String[] words = s.trim().split("\\s+");
        for (int i = words.length-1;i>=0;i--) 
        {
            Sn.append(words[i]);
            if(i!=0) 
            Sn.append(" ");
        }
        return Sn.toString();
    }
}
