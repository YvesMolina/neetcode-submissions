class Solution {
    public int maxArea(int[] heights) {
        // [4155134]
        int max = 0;
        int l = 0;
        int r = heights.length - 1;
        while(l<r){
            int smallest = Math.min(heights[l],heights[r]);
            int volume = smallest*(r-l);
            max=Math.max(max, volume);
            if(heights[l]>heights[r]){
                r--;
            } else {
                l++;
            }
        }
        return max;
    }
}
