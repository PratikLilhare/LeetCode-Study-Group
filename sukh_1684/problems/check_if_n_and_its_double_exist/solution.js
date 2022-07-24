/**
 * @param {number[]} arr
 * @return {boolean}
 */
var checkIfExist = function(arr) {
    let arr2 = arr.filter(element => !!element);
    if(arr.length - arr2.length >= 2) return true;
    let set = new Set();
    arr.forEach((element) => set.add(element));
    return arr.some((element) =>  element && set.has(element*2));
};