class StockSpanner {
   Stack<Integer> s1;
   Stack<Integer> s2;
    public StockSpanner() {
        s1=new Stack<>();
        s2=new Stack<>();

        
    }
    
    public int next(int price) {
        int output=0;
        s1.push(price);
        while(!s1.isEmpty() && s1.peek()<=price){
            output++;
            s2.push(s1.pop());
        }
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        
        return output;

        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */