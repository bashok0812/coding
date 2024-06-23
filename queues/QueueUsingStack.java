lass QueueUsingStack {

    Stack<Integer> st1;
    Stack<Integer> st2;
    public QueueUsingStack() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }
    
    public void push(int x) {
        st1.push(x);
    }
    
    public int pop() {
        int result = -1;
        if(!st2.isEmpty()){
            result = st2.pop();
        } else {
            if(!st1.isEmpty()){
                while(!st1.isEmpty()){
                    st2.push(st1.pop());
                }
                result = st2.pop();
            }
        }

        return result;
    }
    
    public int peek() {
        int result = -1;
        if(!st2.isEmpty()){
            result = st2.peek();
        } else {
            if(!st1.isEmpty()){
                while(!st1.isEmpty()){
                    st2.push(st1.pop());
                }
                result = st2.peek();
            }
        }

        return result;
    }
    
    public boolean empty() {
        return st1.isEmpty() && st2.isEmpty();
    }
}
