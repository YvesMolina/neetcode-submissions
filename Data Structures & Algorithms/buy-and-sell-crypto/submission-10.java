class Solution {
    public int maxProfit(int[] prices) {
        // [7,1,5,3,6,4]
        int max = 0;
        int l =0;
        int r =1;
        while (l<r && r<prices.length){
            while(l<r && prices[l]>prices[r]){
                l++;
            }
            max = Math.max(max, prices[r]-prices[l]);
            r++;
        }
        return max;
    }
}
