class Solution {
    public int longestConsecutive(int[] nums) {
        // longest consecutive : at most n
        // int[n]
        // Set with all the sequence starters
        // sequenceCount = 1
        // sequence starter - > i set sequenceCount to 1, and i do a if
        // that checks if sequence start > 0, then I check if
        //  
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int lngCons = 1;
        int sequenceCount = 1;
        for (int i = 1; i<nums.length; i++){
                if(nums[i]==nums[i-1]+1){
                    sequenceCount++;
                } 
                else if (nums[i]!=nums[i-1]) {
                    lngCons = Math.max(sequenceCount, lngCons);
                    sequenceCount = 1;
                }
        }
        return lngCons > sequenceCount ? lngCons : sequenceCount;
    }
}
