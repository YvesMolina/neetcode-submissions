class Solution {
    public boolean isValid(String s) {
        if(s.length()<2){
            return false;
        }
        Stack<Character> charStack = new Stack<>();
        for(Character c : s.toCharArray()){
            if(!charStack.isEmpty() && c == '}'){
                if(charStack.pop()!='{') return false;
            } else if(!charStack.isEmpty() && c == ')'){
                if(charStack.pop()!='(') return false;
            } else if(!charStack.isEmpty() && c == ']'){
                if(charStack.pop()!='[') return false;
            } else {
                charStack.add(c);
            }
        }
        return charStack.isEmpty();
    }
}
