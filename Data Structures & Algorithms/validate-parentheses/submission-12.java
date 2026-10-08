class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if(s.charAt(0) == '}' || s.charAt(0) == ')' || s.charAt(0) == ']'){
            return false;
        }
        for (char c : s.toCharArray()){
            if(c == ')' && !stack.isEmpty() && stack.pop() != '('){
               return false;
            }
            if(c == ']' && !stack.isEmpty() && stack.pop() != '['){
                return false;
            }
            if(c == '}' && !stack.isEmpty() && stack.pop() != '{'){
                return false;
            }
            if(c == '{' || c == '(' || c == '[') {
            stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
