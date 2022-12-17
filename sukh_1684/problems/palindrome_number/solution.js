/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = (x) => {
    if(x<0){
        return false;
    }
    let temp = x;
    let y = 0;
    while(temp>0){
        y=y*10+temp%10;
        temp = Math.floor(temp/10);
    }
    return x === y;
    
};