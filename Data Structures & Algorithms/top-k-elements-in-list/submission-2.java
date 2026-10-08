class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // num array from 0 to nums.length
        // indexes the amount of occurences
        // do a first iteration with a map, key is value
        // iterate through the map, put the key in the index value
        // two numbers can be at the same index, so need List<List
        HashMap<Integer, Integer> occMap = new HashMap<>();
        List<Integer>[] occurences = new ArrayList[nums.length + 1];
        for (int num : nums){
            occMap.put(num, occMap.getOrDefault(num, 0) + 1);
        }
        for (int i = 0; i<nums.length + 1; i++){
            occurences[i] = new ArrayList<>();
        }
        for (int num : occMap.keySet()){
            int index = occMap.get(num);
            occurences[index].add(num);
        }
        int[] res = new int[k];
        int pointer = 0;
        for(int i = nums.length; i>0 && k>0; i--){
            for(int num : occurences[i]){
                res[pointer] = num;
                pointer++;
                k--;
            }
        }
        return res;
    }
}
