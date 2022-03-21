/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = (x) => {
    if(x<0) return false;
    var temp = x;
    var y=0;
    while(temp!=0){
        y = y*10+temp%10;
        temp = Math.floor(temp/10);    
    }
    if(x === y){
        return true;
    }
    return false;
    
};