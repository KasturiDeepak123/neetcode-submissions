class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s=new Stack<>();
        int[] result=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            int idx=i+1;
            boolean flag=true;
            while( idx<temperatures.length && flag){
                if(temperatures[idx]>temperatures[i]){
                    s.push(temperatures[idx]);
                    flag=false;
                }
                else{
                    idx++;
                }
                
            }
            if(flag){
                result[i]=0;
            }
            else{
                result[i]=idx-i;
            }
            
            
        }
        return result;
        
    }
}
