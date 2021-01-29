class Solution {
    public int[] plusOne(int[] digits) {
       if(digits[digits.length-1]<9){
           digits[digits.length-1]=digits[digits.length-1]+1;
           return digits;
       }
        else{
          int[] ret= new int[digits.length+1]  ;
            for(int i=digits.length-1;i>=0;i--){
                if(digits[i]<9){
                    digits[i]=digits[i]+1;
                    return digits;
                }
                else{
                    digits[i]=0;
                    ret[i+1]=digits[i];
                }
            }
                ret[0]=1;
            return ret;
        }
}
}