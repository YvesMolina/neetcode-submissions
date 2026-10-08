class Solution {
    public int characterReplacement(String s, int k) {
        Set<Character> charSet = new HashSet<>();
        for(Character c : s.toCharArray()){
            charSet.add(c);
        }

            int max = 0;
        for(Character c : charSet){
                int count = 0;
                int l = 0;
            for(int r = 0; r<s.length(); r++){
                if(s.charAt(r)==c){
                    count++;
                }
                while((r-l+1) - count > k){
                    if(s.charAt(l)==c){
                        count--;
                    }
                    l++;
                }
                max = Math.max(r-l+1, max);
            }
        }
        return max;
    }
}
