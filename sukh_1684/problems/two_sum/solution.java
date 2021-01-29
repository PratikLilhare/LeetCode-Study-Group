class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> a = new HashMap<Integer,Integer>();
        int[] ret= new int[2];
        for(int i=0;i<nums.length;i++){
            if(a.containsKey(target-nums[i])){
                ret[0]=i;
                ret[1]=a.get(target-nums[i]);
                return ret;
            }
            a.put(nums[i],i);
        }
        return ret;
        
    }
}