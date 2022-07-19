/**
 * @param {number[]} nums
 * @return {number[]}
 */
var buildArray = (nums) => {
    let ans = []
    for (const element of nums) {
        ans.push(nums[element])
    }
    return ans;
};