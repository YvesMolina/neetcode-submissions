class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for(String str : strs){
            int[] alp = new int[26];
            for(Character c : str.toCharArray()){
                alp[c - 'a']++;
            }
            String key = Arrays.toString(alp);
            groups.putIfAbsent(key, new ArrayList<>());
            groups.get(key).add(str);
        }
        return new ArrayList<List<String>>(groups.values());
    }
}
