class Solution {
    public boolean searchInRow(int[][] mat, int target, int row) {
        // get column size
        int n = mat[0].length;

        int st = 0;
        int end = n - 1;

        while(st <= end) {
            int mid = st + (end - st) / 2;

            if(target == mat[row][mid]) {
                return true;
            }
            else if(target >= mat[row][mid]) {
                st = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] mat, int target) {
        // binary search on rows first
        int m = mat.length; // rows
        int n = mat[0].length; // cols

        int stR = 0;
        int edR = m - 1;

        // running BS to find the row in which target lies 

        while(stR <= edR) {
            int mid = stR + (edR - stR) / 2;
            // check if mid row in only the expected row
            if(mat[mid][0] <= target && target <= mat[mid][n - 1]) {
                // BS on column to check for target
                return searchInRow(mat, target, mid);
            }
            else if(target >= mat[mid][n - 1]) {
                // dowm => right
                stR = mid + 1;
            }
            else {
                // up => left
                edR = mid - 1;
            }
        }
        return false;
    }
}
