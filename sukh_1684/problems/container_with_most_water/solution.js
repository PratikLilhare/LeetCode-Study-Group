/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
    let frontIndex = 0;
    let lastIndex = height.length-1;
    let maxArea = 0;
    while(frontIndex < lastIndex){
        let area = Math.min(height[frontIndex],height[lastIndex])*(lastIndex - frontIndex);
        if(area > maxArea){
            maxArea = area;
        }
       if(height[frontIndex] < height[lastIndex]){
           frontIndex = frontIndex +1;
       }
        else {
            lastIndex = lastIndex -1;
        }
    }
    return maxArea;
};