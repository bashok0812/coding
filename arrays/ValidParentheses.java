class Valid ValidParentheses {
    public boolean isValid(String s) {

        int n  = s.length();
        if(n%2 != 0){
            return false;
        }
        Stack<Character> st = new Stack<Character>();

        for(int i = 0; i< n; i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                st.push(c);
            } else if (c == ')' && !st.empty() && st.peek() == '('){
                st.pop();
            }
            else if (c == '}' && !st.empty() && st.peek() == '{'){
                st.pop();
            }
            else if (c == ']' && !st.empty() && st.peek() == '['){
                st.pop();
            } else {
                return false;
            }
        }
        return st.empty();
    }
}
