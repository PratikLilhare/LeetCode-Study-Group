class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int pointer=1;
        int current=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=current){
               current = nums[i];
               swap(nums,i,pointer);
                
                pointer++;
            }
        }
        return pointer;
        
    }
    private void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right]=temp;
    }
}