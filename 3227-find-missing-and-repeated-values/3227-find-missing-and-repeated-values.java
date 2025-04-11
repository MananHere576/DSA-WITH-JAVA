class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int x=n*m,p=0,q=0;
        int arr[]=new int [x];
        int brr[]=new int [x];
        int k=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[k++]=grid[i][j];
            }
        }
        Arrays.sort(arr);
        for(int i=0;i<x-1;i++)
        {
            if(arr[i]==arr[i+1])
            p=arr[i];
        }
        Set<Integer> set =new HashSet<>();
        for(int i=0;i<x;i++)
        {
            set.add(arr[i]);
        }
        for(int i=0;i<x;i++)
        {
            brr[i]=i+1;
        }
        for(int i=1;i<=x;i++)
        {
            if(set.contains(i))
            continue;
            else
            {
                q=i;
            }
        }
        int c[]=new int[2];
        c[0]=p;
        c[1]=q;
        return c;


    }
}