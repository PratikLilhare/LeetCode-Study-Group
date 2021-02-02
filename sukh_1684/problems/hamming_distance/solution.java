class Solution {
    public int hammingDistance(int x, int y) {
        int temp=1;
        int counter=0;
        for(int i=0;i<32;i++){
            if((((temp&x)==0) && ((temp&y)!=0)) || (((temp&x)!=0) && ((temp&y)==0))){
                counter++;
            }
            temp<<=1;
        }
        return counter;
    }
}