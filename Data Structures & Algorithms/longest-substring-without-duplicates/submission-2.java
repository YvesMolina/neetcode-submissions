class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> chars = new HashSet<>();
        int l = 0;
        int r = 0;
        int max = 0;
        //pwwkew
        while(r<s.length()){
            while(l<r && chars.contains(s.charAt(r))){
                chars.remove(s.charAt(l));
                l++;
            }
            chars.add(s.charAt(r));
            max = Math.max(r-l+1, max);
            r++;
        }
        return max;
    }
}
