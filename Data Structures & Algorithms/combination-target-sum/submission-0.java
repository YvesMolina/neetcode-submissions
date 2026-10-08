class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sumList = new ArrayList<>();
        dfs(res, 0, sumList, nums, target);
        return res;
    }
    public void dfs(List<List<Integer>> res, int i, List<Integer> sumList, int[] nums, int target){
            if(target == 0){
                res.add(new ArrayList<>(sumList));
                return;
            }
            if(target < 0 || i>=nums.length){
                return;
            }
            
            sumList.add(nums[i]);
            dfs(res, i, sumList, nums, target - nums[i]);
            sumList.remove(sumList.size() - 1);
            dfs(res, i+1, sumList, nums, target);
        }
}
