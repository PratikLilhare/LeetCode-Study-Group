class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
       for(int i=0,j=s.length()-1;j>i;i++,j--){
           
           while(i<j && !Character.isLetterOrDigit(s.charAt(i)))
               i++;
           while(i<j && !Character.isLetterOrDigit(s.charAt(j)))
               j--;
           if(s.charAt(i)!=s.charAt(j))
               return false;
               
       }
        return true;
    }
}