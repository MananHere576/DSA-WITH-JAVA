class Solution {
    public List<String> letterCasePermutation(String s) {
        generation(s.toCharArray(), 0);
        return ans;
    }
    List<String> ans = new ArrayList<>();
    public void generation(char[] arr, int i) 
    {
        if(i == arr.length) 
        {
            ans.add(new String(arr));
            return;
        }

        if(Character.isDigit(arr[i])) 
        {
            generation(arr,i+1);
            return;
        }
        arr[i] = Character.toLowerCase(arr[i]);
        generation(arr,i+1);
        arr[i] = Character.toUpperCase(arr[i]);
        generation(arr,i+1);
    }
}
