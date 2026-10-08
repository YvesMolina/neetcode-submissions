class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
    }
    
    public void push(int val) {
        this.stack.push(val);
        if(this.minStack.empty() || this.minStack.peek() >= val){
        this.minStack.push(val);
        }
    }
    
    public void pop() {
        if(this.minStack.peek().equals(this.stack.pop())){
            this.minStack.pop();
        }
    }
    
    public int top() {
        return this.stack.peek();
    }
    
    public int getMin() {
        return this.minStack.peek();
    }
}
