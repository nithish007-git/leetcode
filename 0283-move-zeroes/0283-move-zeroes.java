class Solution {
    public void moveZeroes(int[] nums) { 
        int min =nums.length;
        int j=0;


      for (int i = 0; i < min; i++) {
        if(nums[i]!=0){
            nums[j++]=nums[i];
        }
      }

      while(j<min){
          nums[j++]=0;
      }

    }
}