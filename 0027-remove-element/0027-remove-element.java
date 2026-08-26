class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        int count=0;
        while(left<right){
            if(nums[left]==nums[right]&&nums[left]==val){
                right--;
            }else if(nums[left]==val){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
            }else{
                left++;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=val){
                count++;
            }
        }
        return count;
    }
}