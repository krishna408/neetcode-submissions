class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length-1;

        while(l < r) {
            int mid = l + (r - l + 1)/2;
            if(nums[mid] < nums[mid-1]) {
                return nums[mid];
            }
            
            if(nums[mid] <= nums[r]) {
                r = mid - 1;
            } else {
                l = mid;
            }
        }

        return nums[l];
    }
}
