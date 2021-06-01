class Solution {
    public String reverseOnlyLetters(String s) {
        int len = s.length();
        char arr[] = new char[len];
        for(int i=0;i<s.length();i++){
            arr[i]=s.charAt(i);
        }
        
        for(int i=0,j=s.length()-1;i<j;i++,j--){
     
            while(!Character.isLetter(arr[i]) && i<j){
        
                i++;
            }

            while(!Character.isLetter(arr[j]) && i<j){
                j--;
            }
 
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
        }
        String newS = "";
        for(int i=0;i<arr.length;i++){
            newS = newS+arr[i];
        }
        return newS;
    }
}