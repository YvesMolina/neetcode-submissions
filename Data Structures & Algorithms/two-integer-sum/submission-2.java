class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indices = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int cur = nums[i];
            int diff = target - cur;
            
            if(indices.containsKey(diff)){
                return new int[]{indices.get(diff), i};
            }

            indices.put(cur, i);
        }
        return new int[]{};
    }
}
