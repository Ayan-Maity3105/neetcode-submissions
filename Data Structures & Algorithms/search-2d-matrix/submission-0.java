class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        // brute force approach
        int m = mat.length; // row
        int n = mat[0].length; // col

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(mat[i][j] == target) {
                    return true;
                }
            }
        }

        return false;
    }
}
