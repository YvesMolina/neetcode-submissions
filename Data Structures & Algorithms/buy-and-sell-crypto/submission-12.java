class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int max = 0;
        while(l<r && r<prices.length){
            while(l<r && prices[r]<prices[l]){
                l=r;
            }
            max = Math.max(max, prices[r]-prices[l]);
            r++;
        }
        return max;
    }
}
