class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else
                map.put(arr[i],1);
        }

        int temp=-1;
        List<Integer> keys = new ArrayList<>(map.keySet());
        for(int i=0;i<keys.size();i++)
        {
            int key = keys.get(i);
            if(map.get(key)==key)
                temp=key;
        }

        return temp;
    }
}
