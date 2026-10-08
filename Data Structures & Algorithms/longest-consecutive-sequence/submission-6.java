class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        int max = 0;
        for (int num : nums){
            numSet.add(num);
        }
        for (int num : nums){
            if(!numSet.contains(num-1)){
                int cur = 1;
                while(numSet.contains(num+1)) {
                    num++;
                    cur++;
                }
                max = Math.max(cur, max);
            }
        }
        return max;
    }
}
