class Solution {
    public int maxArea(int[] heights) {
        // So the containers are equal to distance between indexes * max height of the smallest one
        // so brute force
        int left = 0;
        int right = heights.length - 1;
        int res = 0;
        while(left<right){
            if(heights[left]>heights[right]){
            res = Math.max(res, heights[right]*(right-left));
                right--;
            } else {
            res = Math.max(res, heights[left]*(right-left));
                left++;
            }
        }
        return res;
    }
}
