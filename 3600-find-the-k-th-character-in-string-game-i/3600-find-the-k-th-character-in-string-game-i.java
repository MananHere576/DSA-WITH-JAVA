class Solution {
    public char kthCharacter(int k) {
        String word = "a";
        
        while (word.length() < k) {
            int l = word.length();
            String temp = word; 
            for (int i = 0; i < l; i++) {
                char ch = word.charAt(i);
                if (ch == 'z') {
                    temp += 'a';
                } else {
                    temp += (char)(ch + 1);
                }
            }
            word = temp;
        }
        
        return word.charAt(k - 1);
    }
}
