class Solution {
    public int maxArea(int[] heights) {
        // So the containers are equal to distance between indexes * max height of the smallest one
        // so brute force
        int left = 0;
        int right = heights.length - 1;
        int res = 0;
        while(left<right){
            int height = Math.min(heights[left], heights[right]);
            int width = right - left;
            res = Math.max(res, height*width);
            if(heights[left]>heights[right]){
                right--;
            } else {
                left++;
            }
        }
        return res;
    }
}
