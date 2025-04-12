class Solution {
    public boolean areOccurrencesEqual(String s) 
    {
            char arr[] = new char[s.length()];
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                arr[i]=ch;
            }
            Map<Character,Integer> map=new HashMap<>();
            for(int i=0;i<arr.length;i++)
            {
                if(map.containsKey(arr[i]))
                {
                    map.put(arr[i],map.get(arr[i]) + 1);
                }
                else
                map.put(arr[i],1);
            }
            int target = map.get(arr[0]);
            for (int val : map.values()) 
            {
                if (val != target) 
                {
                     return false;
                }
            }
        return true; 
    }
}