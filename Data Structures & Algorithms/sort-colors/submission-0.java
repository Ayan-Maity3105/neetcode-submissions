class Solution {
    public void swap(int[] nums, int st, int end) {
        int temp = nums[st];
        nums[st] = nums[end];
        nums[end] = temp;
    }

    public void sortColors(int[] nums) {
        int n = nums.length;

        // 3 pointers - DNF
        int low = 0; // 0
        int mid = 0; // 1
        int high = n - 1; // 2

        while(mid <= high) {
            if(nums[mid] == 0) {
                swap(nums, mid, low);
                mid++;
                low++;
            }
            else if(nums[mid] == 1) {
                mid++;
            }
            else if(nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            }
        }
    }
}