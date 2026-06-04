class Solution {
    public int maxProfit(int[] prices) {
        int buyprice=prices[0];
        int profit=0;

        for(int i=0;i<prices.length;i++){

            // find minimum
            if(prices[i] < buyprice){
                buyprice=prices[i];
            }

            // current profit
            int curr=prices[i]-buyprice;

            profit=Math.max(curr,profit);
        }

        return profit;
    }
}