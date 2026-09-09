class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> list=new Stack();
        int sum=0;
        for(int i=0;i<operations.length;i++){
            String op=operations[i];
            if(!op.equals("+") && !op.equals("C") && !op.equals("D")){
                list.add(Integer.parseInt(op));
                sum+=Integer.parseInt(op);

            }
            else if(op.equals("+")){
                int last=list.pop();
                int secondlast=list.peek();
                list.add(last);
                list.add(last+secondlast);
                sum+=last+secondlast;
                
            }
            else if(op.equals("C")){
                int e=list.pop();
                sum-=e;
            }
            else if(op.equals("D")){
                int top=list.peek();
                list.add(top*2);
                sum+=top*2;
            }

            

        }
        return sum;
        
    }
}