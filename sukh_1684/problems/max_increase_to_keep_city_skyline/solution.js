/**
 * @param {number[][]} grid
 * @return {number}
 */
var maxIncreaseKeepingSkyline = function(grid) {
    let maxRow = [];
    let maxColumn = [];
    let count = 0;
    grid.forEach((element) => maxRow.push(maxItem(element)));
    let grid2 = grid[0].map((_,index) => grid.map((element) => element[index]));
    grid2.forEach((element) => maxColumn.push(maxItem(element)));
    for(let i=0; i < grid.length; i++){
        for(let j =0; j< grid[i].length; j++){
            count = count + Math.min(maxRow[i],maxColumn[j]) - grid[i][j];
        }
    }
    return count;
};

const maxItem = (nums) => {
    return nums.reduce((previous,current) => previous > current ? previous : current, 0);
}