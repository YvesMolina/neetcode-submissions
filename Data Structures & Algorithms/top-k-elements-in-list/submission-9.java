class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<List<Integer>> frequencies = new ArrayList<>();
        Map<Integer, Integer> occurences = new HashMap<>();
        for (int i = 0; i<=nums.length; i++){
            frequencies.add(new ArrayList<>());
        }
        for (int num : nums){
            occurences.put(num, occurences.getOrDefault(num, 0)+1);
        }
        for (int key : occurences.keySet()){
            frequencies.get(occurences.get(key)).add(key);
        }
        int[] res = new int[k];
        int j = 0;
        for(int i = nums.length; i>=0; i--){
            for(int occ : frequencies.get(i)){
                res[j++] = occ;
                if(j==k){
                    return res;
                }
            }
        }
        return res;
    }
}
