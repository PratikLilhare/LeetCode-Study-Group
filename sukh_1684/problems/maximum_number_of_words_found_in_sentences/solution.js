/**
 * @param {string[]} sentences
 * @return {number}
 */
var mostWordsFound = (sentences)  => {
    var max = 0;
    sentences.forEach((sentence) => {
        var words = 0;
        for(var i =0; i<sentence.length;i++){
            if(sentence.charAt(i) == ' '){
                words ++;
            }
        }
        ++ words;
        if(words > max){
            max = words;
        }
            
    })
    return max;
};