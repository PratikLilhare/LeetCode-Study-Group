/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function(nums, target) {
    var cnt = 0;
  for ( const num of nums) {
      if(num >= target){
         return cnt;
      }
      cnt++;    
  }
    return cnt;
    
};