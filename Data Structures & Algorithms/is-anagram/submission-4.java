class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> string1 = new HashMap<>();
        HashMap<Character, Integer> string2 = new HashMap<>();
        for (char c : s.toCharArray()){
            string1.put(c, string1.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()){
            string2.put(c, string2.getOrDefault(c, 0) + 1);
        }

        return string1.equals(string2);
    }
}
