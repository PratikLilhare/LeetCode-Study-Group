/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = (nums, target)  => {
    const map = new Map();
    for(i=0;i<nums.length;i++){
        map.set(nums[i],i);
    }
    for(i=0;i<nums.length-1;i++){
      if(map.has(target-nums[i]) && map.get(target-nums[i])!=i){
          return [i,map.get(target-nums[i])];
      }
    }
     
};