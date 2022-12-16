class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int leftP = 0;
        int rightP = numbers.length-1;
        while(leftP<rightP){
            int tot = numbers[leftP]+numbers[rightP];
            if(tot == target) return new int[]{leftP+1, rightP+1};
            if(tot>target) 
            rightP--;
            if(tot<target) 
            leftP++;
        }
        return new int[]{-1,-1};
    }
}