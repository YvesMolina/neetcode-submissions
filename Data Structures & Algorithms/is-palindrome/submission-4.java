class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while (left<right){
            while (left<right && !charCheck(s.charAt(left))){
                left++;
            }
            while (left<right && !charCheck(s.charAt(right))){
                right--;
            }
            if(Character.toUpperCase(s.charAt(left)) != Character.toUpperCase((s.charAt(right)))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean charCheck(char c){
        return (c <= 'Z' && c >= 'A')
        || (c >= 'a' && c <= 'z')
        || (c <= '9' && c >= '0');
    }
}
