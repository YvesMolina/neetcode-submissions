class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> diffMap = new HashMap<>();
        for (int i = 0; i<nums.length; i++){
            int val = nums[i];
            int diff = target - val;
            if (diffMap.containsKey(diff)){
                return new int[]{diffMap.get(diff), i};
            }
            diffMap.put(val, i);
        }
        return new int[] {};
    }
}
