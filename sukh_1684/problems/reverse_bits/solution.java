public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
      int temp=1;
        int res=0;
        for(int i=0;i<32;i++){
            if((n&temp)!=0){
                res<<=1;
                res=res|1;
            }
            else{
                res<<=1;
            }
            temp<<=1;

            
        }
        return res;
    }
}