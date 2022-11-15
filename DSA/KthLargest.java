class KthLargest {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}

//[3,2,1,5,6,4], k =2
  output : 5
  