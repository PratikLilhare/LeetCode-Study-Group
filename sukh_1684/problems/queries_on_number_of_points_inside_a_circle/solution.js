/**
 * @param {number[][]} points
 * @param {number[][]} queries
 * @return {number[]}
 */
var countPoints = function(points, queries) {
    let ans = [];
    queries.forEach(([qx,qy,r]) => { 
        let count = 0;
        points.forEach(([x,y]) => {
            if(Math.sqrt((qx-x)**2 + (qy-y)**2) <= r){
                    count ++;
            }
        }) ;
        ans.push(count);
    });
    return ans;
};