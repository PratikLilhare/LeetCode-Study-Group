class Solution {
    public int maximumGain(String s, int x, int y) {
       int count =0;
        char first = x > y ? 'a' : 'b';
        char second = first == 'a' ? 'b' : 'a';
        int min = Math.min(x,y);
        int max = Math.max(x,y);
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for(int i=0; i < s.length(); i++){

            if(!stack1.isEmpty() && stack1.peek() == first && s.charAt(i) == second){
                stack1.pop();
                count+=max;
            }else{
                stack1.push(s.charAt(i));
            }

        }

        while(!stack1.isEmpty()){

            if(!stack2.isEmpty() && stack2.peek() == first 
                        && stack1.peek() == second){
                stack1.pop();
                stack2.pop();
                count+=min;
            }else{
                stack2.push(stack1.pop());
            }


        }

        return count;
    }
}