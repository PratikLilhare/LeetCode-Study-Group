class Solution {
    public int maxProfit(int[] prices) {
        int temp=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]-temp>profit){
                profit=prices[i]-temp;
            }
            else if(prices[i]<temp){
                temp=prices[i];
            }
        }
        return profit;
    }
    
}