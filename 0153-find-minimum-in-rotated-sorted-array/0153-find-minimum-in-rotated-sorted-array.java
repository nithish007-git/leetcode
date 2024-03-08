class Solution {
   public int findMin(int[] nums) {
	return binSearch(nums, 0, nums.length - 1);
}
    
int binSearch(int nums[], int lo, int hi) {

	int mid = (lo + hi) / 2;

	if (nums[mid] > nums[hi]) {
		return binSearch(nums, mid + 1, hi);
	// check if mid > lo, so that nums[mid-1] doesn't go out of array bounds	
	} else if (mid > lo && nums[mid-1] < nums[mid]) {
		return binSearch(nums, lo, mid - 1);
	} else {
		return nums[mid];
	}
}


}