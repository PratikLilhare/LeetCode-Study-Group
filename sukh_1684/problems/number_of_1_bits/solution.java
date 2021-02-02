public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int counter=0;
        int test=1;
        for(int i=0;i<32;i++){
            if((n&test)!=0)
                counter++;
            test<<=1;
        }
        return counter;
    }
   
}