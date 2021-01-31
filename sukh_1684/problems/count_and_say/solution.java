class Solution {
    public String countAndSay(int n) {
        
           String s = helper("",n,1);
        return s;
        
    }
     String helper(String s,int n,int k){
        if(k>n){
            return s;
        }
        if(s==""){
            
           return helper("1",n,k+1);
        
        }
        else{
        int counter=1;
        String s1="";
        for(int i=0;i<s.length();i++){
            if((i+1)<s.length() && s.charAt(i)==s.charAt(i+1)){
                counter++;
            }
            else{
                s1=s1+counter+s.charAt(i);
                counter=1;
            }
        }
        return helper(s1,n,k+1);
    
       }
    }
 
}