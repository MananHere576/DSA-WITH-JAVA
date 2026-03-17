class Solution 
{
    public List<String> letterCasePermutation(String s) 
    {
        List<String> res = new ArrayList<>();
        bt(s.toCharArray(),0,res);
        return res;
    }

    private void bt(char[] arr,int i,List<String> res)
    {
        if(i==arr.length)
        {
            res.add(new String(arr));
            return;
        }
        if (Character.isDigit(arr[i])) 
        {
            bt(arr,i+1,res);
        } else {
            arr[i] =Character.toLowerCase(arr[i]);
            bt(arr,i+1,res);

            arr[i] =Character.toUpperCase(arr[i]);
            bt(arr,i+1,res);
        }
    }
}