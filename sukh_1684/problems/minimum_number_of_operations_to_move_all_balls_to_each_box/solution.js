/**
 * @param {string} boxes
 * @return {number[]}
 */
var minOperations = function(boxes) {
    let BoxesArr = boxes.split("").map(element => Number(element));
    let ans = [];
    for(const [i,_] of BoxesArr.entries()){
        let count = 0;
        for(const [j,element] of BoxesArr.entries()){
            if(i!==j && element != 0){
                count = count + Math.abs(i-j);
            }
        }
        ans.push(count);
    }
    return ans;
    
};