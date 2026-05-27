class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        int f = 1;
        int majority = nums[0];

        for(int i=1 ; i<n; i++) {
            if(nums[i] == nums[i-1]) {
                f++;
            }
            else {
                f = 1;
                majority = nums[i];
            }

            if(f > n/2) {
                return majority;
            }
        }

        return majority;
    }
}