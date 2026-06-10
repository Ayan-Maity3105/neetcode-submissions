class Solution {
    public int maxArea(int[] heights) {
        int area = 0;
        int h = 0;
        int w = 0;

        int i = 0;
        int j = heights.length - 1;

        while(i < j) {
            h = Math.min(heights[i] , heights[j]);
            w = j - i;
            area = Math.max(area, h * w);
            if(heights[i] <= heights[j]) {
                i++;
            }
            else {
                j--;
            }
        }

        return area;
    }
}
