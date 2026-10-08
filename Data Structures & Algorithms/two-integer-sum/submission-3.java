class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> diffs = new HashMap<>();
        for (int i = 0; i<nums.length; i++){
            int val = nums[i];
            int dif = target - val;
            if(diffs.containsKey(dif)){
                return new int[]{diffs.get(dif), i};
            }
            diffs.put(val, i);
        }
        return new int[]{};
    }
}
