class Solution {
    public boolean isAnagram(String s, String t) {

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        String str = new String(a);
        String gtr = new String(b);

        if(str.equals(gtr))
        {
            return true;
        }
        return false;
    }
}
