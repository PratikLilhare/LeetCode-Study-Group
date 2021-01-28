class Solution {
    public int removeDuplicates(int[] nums) {
        int a,pointer;
          if(nums.length==0){
              return 0;
          }
         a=nums[0];
         pointer=1;
    
        
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]!=a){
                if(pointer!=i){
                nums[pointer]=nums[i];
                }
                pointer=pointer+1;
                a=nums[i];
            }
            
        }
        return pointer;
    }
}

