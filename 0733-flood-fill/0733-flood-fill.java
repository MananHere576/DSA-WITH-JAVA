class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;
        int x = image[sr][sc];
        
        if(x==color) 
        return image;
        dfs(image,sr,sc,x,color,m,n);
        return image;
    }

    private void dfs(int[][] image,int i,int j,int x,int color,int m,int n) 
    {
        if(i<0 || j<0 || i>=m || j>=n || image[i][j]!=x) 
        return;

        image[i][j] = color;
        dfs(image,i+1,j,x,color,m,n); 
        dfs(image,i-1,j,x,color,m,n);
        dfs(image,i,j+1,x,color,m,n); 
        dfs(image,i,j-1,x,color,m,n); 
    }
}
