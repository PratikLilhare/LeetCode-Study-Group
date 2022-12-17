/**
 * @param {number[]} nums
 * @return {number}
 */
var numIdenticalPairs = function(nums) {
    let ans = 0;
    nums.forEach((element,index) => {
        for(var i = index+1 ; i<nums.length; i++){
            if(nums[i] === element )
                ans ++;
        }
    } )
    return ans;
};