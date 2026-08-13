class Solution {
    public void moveZeroes(int[] nums) {
        int z=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                // Swap(nums[i],nums[z]);
                int t=nums[i];
                nums[i]=nums[z];
                nums[z]=t;
                z++;
            }
        }
    }
}