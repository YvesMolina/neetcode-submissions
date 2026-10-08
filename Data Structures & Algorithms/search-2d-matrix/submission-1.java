class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // binary search

        int left = 0;
        int right = matrix.length-1;
        int middle = 0;
        while(left<=right){
            middle = left + (right-left) / 2;
            if(matrix[middle][0]>target){
                right = middle - 1;
            } else if (matrix[middle][matrix[middle].length-1]<target){
                left = middle + 1;
            } else {
                int subLeft = 0;
                int subRight = matrix[middle].length-1;
                int subMiddle = 0;
                while(subLeft<=subRight){
                subMiddle = subLeft + (subRight-subLeft) / 2;
                    if(matrix[middle][subMiddle]>target){
                        subRight = subMiddle - 1;
                    } else if (matrix[middle][subMiddle]<target) {
                        subLeft = subMiddle + 1;
                    } else {
                        return true;
                    }
                }
                    return false;
            }
        }
        return false;

    }
}
