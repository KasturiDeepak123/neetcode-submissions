class Solution {
    public String decodeString(String s) {
        Stack<Integer> countstack=new Stack<>();
        Stack<String> stringstack=new Stack<>();
        int num=0;
        String current="";
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                num=num*10+c-'0';
            }
            else if(c=='['){
                countstack.push(num);
                stringstack.push(current);
                num=0;
                current="";

            }
            else if(c==']'){
                String previous=stringstack.pop();
                int count=countstack.pop();
                StringBuilder sb=new StringBuilder(previous);
                for(int i=0;i<count;i++){
                    sb.append(current);
                }
                current=sb.toString();

            }
            else{
                current+=c;
            }

        }
        return current;
        
    }
}