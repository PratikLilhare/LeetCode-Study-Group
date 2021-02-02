class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            ret.add(new ArrayList<>());
            for(int j=0;j<=i;j++){
              if(i==0||j==0||j==i){
                  ret.get(i).add(1);
              }
                else{
                    ret.get(i).add(ret.get(i-1).get(j-1)+ret.get(i-1).get(j));
                }
            }
        }
        return ret;
        
    }
}