class Solution {
    public boolean isPalindrome(String s) {
        int j= s.length()-1;
        for(int i=0;i<j;){
            char a,b;
            do{
                a=s.charAt(i);
                i++;
            }while(!Character.isLetterOrDigit(a) && i<j);

            do{
                b=s.charAt(j);
                j--;
            }while(!Character.isLetterOrDigit(b) && i<j);
            if(!Character.isLetterOrDigit(a) || !Character.isLetterOrDigit(b)){
                return true;
            }
            System.out.println(a+ "  "+b);
            a= Character.toLowerCase(a);
            b= Character.toLowerCase(b);            
            if(a!=b){
                return false;
            }
            
            
        }
        return true;
    }
}