class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> elements = new HashSet<>();
        for (int num : nums){
            elements.add(num);
        }
        int max = 0;
        for(int element : elements){
            if(!elements.contains(element-1)){
                int cur = 1;
                while(elements.contains(element+cur)){
                    cur++;
                }
                max = Math.max(cur,max);
            }
        }
        return max;
    }
}
