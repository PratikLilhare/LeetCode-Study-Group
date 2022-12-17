class Solution {
    public int searchInsert(int[] nums, int target) {
        int cnt = 0;
        for ( int num : nums){
            if (num >= target){
                break;
            }
            cnt ++;
        }
        return cnt;
    }
}