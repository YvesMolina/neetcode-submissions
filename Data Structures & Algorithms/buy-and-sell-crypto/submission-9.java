class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 0;
        int max = 0;
        while(left<prices.length && right<prices.length){
            max = Math.max(prices[right]-prices[left], max);
            if(prices[right]<prices[left]){
                left++;
            } else {
                right++;
            }
        }
        return max;
    }
}
