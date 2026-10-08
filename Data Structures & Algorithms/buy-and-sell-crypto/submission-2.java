class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int maxPrice = 0;
        for (int i = 0; i<prices.length; i++){
        int pointer = 1;
            while (i+pointer<prices.length && prices[i+pointer]>=prices[i] ){
                maxPrice = Math.max(prices[i+pointer]-prices[i], maxPrice);
                pointer++;
            }
        }
        return maxPrice;
    }
}
