class Solution {
    public int findMin(int[] nums) {
        int l=0,mid=0, h=nums.length-1;
        
        while(l<h){
            mid=l+(h-l)/2;
            if(nums[h] <= nums[mid]){
                l=mid+1;
            }else{
                h=mid;
            }
        }

        return nums[l];
    }
}
