class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Max is the goat
        Map<String, List<String>> groups = new HashMap<>();
        for(String str : strs){
            int[] alph = new int[26];
            for(Character c : str.toCharArray()){
                alph[c - 'a']++;
            }
            String key = Arrays.toString(alph);
            groups.putIfAbsent(key, new ArrayList<String>());
            groups.get(key).add(str);
        }

        return new ArrayList<List<String>>(groups.values());
    }
}
