/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = (s) => {
    s =s.trim();
    let cnt =0;
    for(i=s.length-1; i>=0;i--){
        if(s.charAt(i)===' '){
            return cnt;
        }
        cnt++;
    }
    return cnt;
};