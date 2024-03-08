class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1)
        {
            return nums[0];
        }
        for(int i = 0, j = 1; i < nums.length-1; i++, j++)
        {
            if(nums[i] != nums[j])
            {
                return nums[i];
            }
            else
            {
                i++;
                j++;
            }
        }
        return nums[nums.length - 1];
    }
}