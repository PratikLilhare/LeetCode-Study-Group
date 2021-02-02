class Solution {
    public boolean isValid(String s) {
       Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if((c==')'||c=='}'||c==']')){
                if(stack.isEmpty()){
                return false;
                }
                char temp=stack.pop();
                if(temp=='(' && c==')'){
                    continue;
                }
                if(temp=='{' && c=='}'){
                    continue;
                }
                if(temp=='[' && c==']'){
                    continue;
                }
                return false;
            }
            else{
                stack.push(c);
            }
            
      
            
        }
              if(stack.isEmpty()){
                return true;
            }
            
            return false;
        
        
    }
}