class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = square(n);
        while(fast!=1 && fast!=slow){
            slow= square(slow);
            fast= square(square(fast));
        }
        if(fast==1){
            return true;
        }
        return false;
}
    
    private int square(int n){
        int sum=0;
        while(n>0){
            sum=sum+(n%10)*(n%10);
            n=n/10;
        }
        return sum;
    }
}
