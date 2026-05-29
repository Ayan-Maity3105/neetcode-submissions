class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int a = 0, b = 0;
        int n = grid.length;
        HashSet<Integer> set = new HashSet<Integer>();
        int actualSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                actualSum += grid[i][j];
                if (set.contains(grid[i][j])) {
                    a = grid[i][j];
                } else {
                    set.add(grid[i][j]);
                }
            }
        }

        int expectedSum = (n * n) * (n * n + 1) / 2;
        b = expectedSum - actualSum + a;
        int[] ans = {a, b};
        return ans;
    }
}