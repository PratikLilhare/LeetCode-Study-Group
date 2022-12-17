class Solution {
    public void moveZeroes(int[] nums) {
        int pointer=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]==0){

                i++;
                                if(i==nums.length){
                    return;
                }
            }
                swap(nums,pointer,i);
                pointer++;
            }
        }
        
    
    private void swap(int[] nums, int left,int right){
        int temp = nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }
}