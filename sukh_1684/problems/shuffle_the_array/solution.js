/**
 * @param {number[]} nums
 * @param {number} n
 * @return {number[]}
 */
var shuffle = function(nums, n) {
    var ans = []
    for(var i =0; i < n ; i++){
        ans.push(nums[i]);
        ans.push(nums[n+i]);
    }
    return ans
    
};