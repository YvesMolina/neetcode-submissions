class Solution {
    public int maxProfit(int[] prices) {
        int currentPrice = prices[0];
        int maxProfit = 0;
        int min = prices[0];
        int max = prices[0];
        for (int i = 1; i<prices.length; i++) {
            if (prices[i]<min){
                min = prices[i];
                max = prices[i];
            }
            if (prices[i]>min && prices[i]>max){
                max = prices[i];
                maxProfit = max - min > maxProfit ? max - min : maxProfit;
            }
        }
        return maxProfit;
    }
}