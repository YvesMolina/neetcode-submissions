class MinStack {

    Stack<Integer> stack = new Stack<>();
    HashMap<Integer, Integer> numMap = new HashMap<>();

    public MinStack() {
        this.stack = new Stack<>();
    }
    
    public void push(int val) {
        this.numMap.put(val, this.numMap.getOrDefault(val, 0) + 1);
        this.stack.push(val);
    }
    
    public void pop() {
        int lastNum = this.stack.pop();
        if(this.numMap.get(lastNum) == 1){
            this.numMap.remove(lastNum);
        } else {
            this.numMap.put(lastNum, this.numMap.get(lastNum) - 1);
        }
    }
    
    public int top() {
        return this.stack.peek();
    }
    
    public int getMin() {
        int lastNum = this.stack.peek();
        for (int key : numMap.keySet()){
        if (key<lastNum){
            lastNum = key;
        }
        }
        return lastNum;
    }
}
