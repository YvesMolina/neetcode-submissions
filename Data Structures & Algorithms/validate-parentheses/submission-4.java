class Solution {
    public boolean isValid(String s) {
        if (s.charAt(0)=='}' || s.charAt(0)==')' || s.charAt(0)==']' || s == null){
            return false;
        }
        Stack<Character> charStack = new Stack<>();
        for (char c : s.toCharArray()){
            if(!charStack.isEmpty() && c == '}'){
                if(charStack.peek() == '{') {
                    charStack.pop();
                } else {
                    return false;
                }
            } else if(c == ')'){
                if( !charStack.isEmpty() && charStack.peek() == '(') {
                    charStack.pop();
                } else {
                    return false;
                }
            } else if(c == ']'){
                if(!charStack.isEmpty() && charStack.peek() == '[') {
                    charStack.pop();
                } else {
                    return false;
                }
            } else {
                charStack.push(c);}
        }
        return charStack.isEmpty();
    }
}
