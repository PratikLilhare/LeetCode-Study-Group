/**
 * @param {number[]} nums
 * @return {number[]}
 */
var getConcatenation = (nums) => {
    let ans = [];
    ans.push(...nums);
    ans.push(...nums);
    return ans;
    
    
};