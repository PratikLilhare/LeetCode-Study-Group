class Solution {
    public boolean isValid(String s) {
        
        //'(', ')', '{', '}', '[' and ']'     
        Stack<Character> brackets = new Stack<>();
        for(int i=0;i<s.length();i++){
            char temp = s.charAt(i);
            if(temp == '(' || temp == '{' || temp == '['){
                brackets.push(temp);
            }
            else{
                if(brackets.isEmpty()){
                    return false;
                }
            char check = brackets.pop();

            if(temp == ')' && check!='('){
                return false;
            }
           if(temp == ']' && check!='['){
                return false;
            }
            if(temp == '}' && check!='{'){
                return false;
            }
            }
        }
            
         if(brackets.isEmpty())  {
        return true;
         }
        return false;
    }
}