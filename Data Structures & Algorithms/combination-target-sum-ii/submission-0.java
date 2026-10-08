class Solution {
        List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> cur = new ArrayList<>();
        Arrays.sort(candidates);
        backtracking(candidates, target, 0, cur);
        return res;
    }

    public void backtracking(int[] candidates, int target, int i, List<Integer> cur){
        if(target==0){
            res.add(new ArrayList<Integer>(cur));
            return;
        }
        if(target<0 || i>=candidates.length){
            return;
        }
        cur.add(candidates[i]);
        backtracking(candidates, target-candidates[i], i+1, cur);
        cur.remove(cur.size() - 1);
        while(i+1 < candidates.length && candidates[i] == candidates[i+1]){
            i++;
        }
        backtracking(candidates, target, i+1, cur);

    }
}
