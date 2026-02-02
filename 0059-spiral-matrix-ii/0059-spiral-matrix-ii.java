class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][]=new int[n][n];
        if (matrix == null || matrix.length == 0) {
            return matrix;
        }
        int p=1;
        int rows = matrix.length, c = matrix[0].length;
        int l = 0, r = c-1, top = 0, b = rows-1;
        while (l <= r && top <= b) {
            for (int i = l; i <= r; i++) {
                matrix[top][i]=p++;
            }
            top++;
            for (int i = top; i <= b; i++) {
                matrix[i][r]=p++;
            }
            r--;
            
            if (top <= b) {
                for (int i = r; i >= l; i--) {
                    matrix[b][i]=p++;
                }
                b--;
            }
            
            if (l <= r) {
                for (int i = b; i >= top; i--) {
                    matrix[i][l]=p++;
                }
                l++;
            }
        }
        return matrix;
    }
}















