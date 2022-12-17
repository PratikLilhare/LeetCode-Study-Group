/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let map = new Map();
    let ans = [];
    for(let i=0; i<nums.length;i++){
        if(map.has(target-nums[i])){
            ans.push(i,map.get(target-nums[i]));
            break;
        }
        else{
            map.set(nums[i],i);
        }
    }
    return ans;
};