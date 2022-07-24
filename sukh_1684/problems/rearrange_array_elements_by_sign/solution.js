/**
 * @param {number[]} nums
 * @return {number[]}
 */
var rearrangeArray = function(nums) {
    /**
    for(let i =0; i<nums.length-1; i++){
        if(i%2 == 0){
            if(nums[i] > 0){
                continue;
            }
        }
        else{
            if(nums[i] < 0){
                continue;}
        }
        let tempArr = [];
        tempArr.push(nums[i])
        for(let j=i+1; j< nums.length; j++){
           if(sameSign(nums[i],nums[j])){
                tempArr.push(nums[j]) ;
                nums[j] = tempArr.shift();
           }
            else{
                tempArr.push(nums[j]);
                nums[j] = tempArr.shift();
                break;
            }
        }
        nums[i] = tempArr.shift();
    }
    return nums;
    **/
    let positive = [];
    let negative = [];
    let ans = [];
    nums.forEach((element) => {
        if(element >= 0){
            positive.push(element);
        }
        else{
            negative.push(element);
        }
    }
    )
    for(let i =0 ; i < nums.length /2 ; i++){
        ans.push(positive[i]);
        ans.push(negative[i]);
    }
    return ans;
};
const sameSign = (a,b) => {
    if((a >= 0 && b >= 0) || (a < 0 && b < 0)){
        return true;
    }
    return false;
}
