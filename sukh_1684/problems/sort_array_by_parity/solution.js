/**
 * @param {number[]} nums
 * @return {number[]}
 */
var sortArrayByParity = function(nums) {
    let start = 0;
    let end = nums.length-1;
    while(start < end){
        if(!isEven(nums[start]) && isEven(nums[end])){
           const temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
           }
        if(isEven(nums[start])){
            start++;
        }
        if(!isEven(nums[end])){
            end--;
        }
    }
    return nums;
};

const isEven = (element) => element%2 === 0;