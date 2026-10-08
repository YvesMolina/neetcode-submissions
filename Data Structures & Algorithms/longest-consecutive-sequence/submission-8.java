class Solution {
    public int longestConsecutive(int[] nums) {
        //[2,3,3,4,4,5,20]
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int max = 0;
        int cur = 1;
        for(int i = 1; i<nums.length; i++){
            if (nums[i-1]+1 == nums[i]){
                cur++;
            } else if (nums[i-1]<nums[i]-1) {
                max = Math.max(cur,max);
                cur = 1;
            }
        }
        return Math.max(cur,max);
    }
}
