class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int max = 0;
        for (int i = 0; i<prices.length; i++){
            while(left<i){
                if(prices[left]<prices[i]){
                    max = Math.max(max, prices[i]-prices[left]);
                    break;
                } else {
                    left = i;
                }
            }
        }
        return max;
    }
}
