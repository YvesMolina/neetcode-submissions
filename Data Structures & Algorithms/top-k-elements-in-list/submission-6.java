class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<List<Integer>> frequencies = new ArrayList<>();
        for(int i = 0; i<=nums.length; i++){
            frequencies.add(new ArrayList<>());
        }
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        for (int val : freqMap.keySet()){
            int index = freqMap.get(val);
            frequencies.get(index).add(val);
        }
        int[] res = new int[k];
        int iterator = 0;
        for (int i = nums.length; i>=0; i--){
            for(int num : frequencies.get(i)){
                if(iterator==k){
                    return res;
                }
                res[iterator]=num;
                iterator++;
            }
        }
        return res;
    }
}
