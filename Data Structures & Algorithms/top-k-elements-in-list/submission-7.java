class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Max is the goat
        List<List<Integer>> occList = new ArrayList<>();
        Map<Integer, Integer> occurences = new HashMap<>();
        for(int i = 0; i<=nums.length; i++){
        occList.add(new ArrayList<>());
        }
        for (int num : nums){
            occurences.put(num, occurences.getOrDefault(num, 0) + 1);
        }
        for (int key : occurences.keySet()){
            occList.get(occurences.get(key)).add(key);
        }
        int[] res = new int[k];
        for (int i = nums.length; i>=0; i--){
            for(int occurence : occList.get(i)){
                res[--k]=occurence;
                if(k==0){
                    return res;
                }
            }
        }
        return res;

    }
}
