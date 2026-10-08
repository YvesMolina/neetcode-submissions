class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        HashSet<Character> charSet = new HashSet<>();
        for (int i = 0; i<s.length(); i++){
            while(charSet.contains(s.charAt(i))){
                charSet.remove(s.charAt(left));
                left++;
            } 
                charSet.add(s.charAt(i));
                maxLength = Math.max(maxLength, i-left+1);
        }
        return maxLength;
    }
}
