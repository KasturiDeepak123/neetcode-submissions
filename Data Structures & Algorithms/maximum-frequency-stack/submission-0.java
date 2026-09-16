class FreqStack {
    Map<Integer,Integer> freq;
    Map<Integer,Stack<Integer>> group;
    int MaxFreq=0;

    public FreqStack() {
        freq=new HashMap<>();
        group=new HashMap<>();
        
    }
    
    public void push(int val) {
        int f=freq.getOrDefault(val,0)+1;
        freq.put(val,f);
        MaxFreq=Math.max(MaxFreq,f);
        group.putIfAbsent(f,new Stack<>());
        group.get(f).push(val);
        
    }
    
    public int pop() {
        Stack<Integer> stack=group.get(MaxFreq);
        int val=stack.pop();
        freq.put(val,freq.get(val)-1);
        if (stack.isEmpty()) {
            MaxFreq--;
        }
        return val;

        
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */