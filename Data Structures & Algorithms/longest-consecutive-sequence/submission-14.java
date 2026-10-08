class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> elements = new HashSet<>();
        for (int num : nums){
            elements.add(num);
        }
        int max = 0;
        for(int num : elements){
            if(!elements.contains(num-1)){
        int cur = 0;
                while(elements.contains(num+cur)){
                    cur++;
                }
                max = Math.max(max, cur);
            }
        }
        return max;
    }
}
