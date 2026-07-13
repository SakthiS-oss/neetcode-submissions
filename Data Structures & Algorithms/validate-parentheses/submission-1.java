class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '{' || c == '[' || c == '('){
                stack.push(c);
            }
            if(c == '}' || c == ')' || c == ']'){
                if(stack.isEmpty()){return false;}
                char temp = stack.pop();
            if ((c == '}' && temp != '{') || (c == ')' && temp != '(') || (c == ']' && temp != '[')) {
                return false;
            }
            }
        }
        return stack.isEmpty();
    }
}
