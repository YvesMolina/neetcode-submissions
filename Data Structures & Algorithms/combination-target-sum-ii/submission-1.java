class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> cur = new ArrayList<>();
        Arrays.sort(candidates);
        backtracking(candidates, target, cur, 0);
        return res;
    }
    public void backtracking(int[] candidates, int target, List<Integer> cur, int i) {
    if (target==0){
        res.add(new ArrayList<>(cur));
        return;
        }
    if (target < 0 || i>=candidates.length){
        return;
    }
    cur.add(candidates[i]);
    backtracking(candidates, target - candidates[i], cur, i+1);
    cur.remove(cur.size() - 1);
    while(i<candidates.length-1 && candidates[i] == candidates[i+1]){
        i++;
    }
    backtracking(candidates, target, cur, i+1);
    }

}
