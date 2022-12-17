class Solution {
    public int myAtoi(String s) {
       s=s.trim();
        int k=0;
        boolean negative=false;
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            
            if(c=='-' && i==0){
                negative=true;
                continue;
            }
            if(c=='+'&& i==0){
                continue;
            }
            


            if(!Character.isDigit(c)){
                break;
            }
            int l=(int)c - 48;
             if(k>Integer.MAX_VALUE/10||(k==Integer.MAX_VALUE/10 && l >Integer.MAX_VALUE%10 ))
                      return ((negative)?Integer.MIN_VALUE:Integer.MAX_VALUE);
            k=k*10+l;
            System.out.println(k);

                

        }
        if(negative)
            k=-k;

        return k;
    }
}