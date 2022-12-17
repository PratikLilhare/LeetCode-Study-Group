/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
    let map = new Map();
    nums.forEach((element) => {
        if(map.has(element)){
            map.set(element,map.get(element)+1);
        }
        else{
            map.set(element,1);
        }
    });
    let res;
    map.forEach((element,index) => {
        if(element == 1){
            res = index;
        }
    });
    return res;
};