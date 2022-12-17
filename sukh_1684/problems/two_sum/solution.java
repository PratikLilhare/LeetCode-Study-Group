class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> elements = new HashMap<>();
        int [] res = new int[2];
        for(int i=0;i<nums.length;i++){
            int r = target -nums[i];
            if(elements.containsKey(r)){
                res[0]=elements.get(r);
                res[1]= i;
            }
            else{
                elements.put(nums[i],i);
            }
        }
        return res;
    }
}