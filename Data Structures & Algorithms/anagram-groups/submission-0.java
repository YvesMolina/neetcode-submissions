class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
        int[] count = new int[26];
        for (char c : s.toCharArray()){
            count[c - 'a']++;
        }
        String str = Arrays.toString(count);
        res.putIfAbsent(str, new ArrayList<>());
        res.get(str).add(s);
        }
        List<List<String>> lists = new ArrayList<>();
        for (List<String> stringList : res.values()){
            lists.add(stringList);
        }

        return lists;
    }
}
