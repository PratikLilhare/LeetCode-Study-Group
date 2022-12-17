class Solution {
    public int evalRPN(String[] tokens) {
        String add="+";
        String sub="-";
        String mul="*";
        String div="/";
        Stack<Integer> stack = new Stack<>();
        for(int j=0 ; j< tokens.length;j++){

            if(add.equals(tokens[j])){
                int i =stack.pop()+stack.pop();
                stack.push(i);
            }else if(sub.equals(tokens[j])){
                int i =stack.pop();
                i = stack.pop() - i;
                stack.push(i);
            }else if(mul.equals(tokens[j])){
                int i =stack.pop();
                i = stack.pop() * i;
                stack.push(i);
            }else if(div.equals(tokens[j])){
                    int i =stack.pop();
                i = stack.pop() / i;
                stack.push(i);
            }else{
                stack.push(Integer.parseInt(tokens[j]));
            }

        }
        
        return stack.pop();
    }
}