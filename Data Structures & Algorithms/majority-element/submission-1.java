class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int f = 1;
        int majority = nums[0];

        for (int i = 1; i < n; i++) { // O(n)
            if (nums[i] == majority) {
                f++;
            } else {
                f--;
                if (f == 0) {
                    majority = nums[i];
                    f = 1;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == majority) {
                count++;
            }
        }

        if (count > n / 2) {
            return majority;
        } else {
            return -1;
        }
    }
}