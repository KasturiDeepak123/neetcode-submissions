class Solution {
    public String simplifyPath(String path) {
        Stack<String> s=new Stack<>();
        String[] parts=path.split("/");
        for(String part:parts){
            if(part.equals("") || part.equals(".")){
                continue;
            }
            if(part.equals("..")){
                if(!s.isEmpty()){
                    s.pop();
                }
            }
            else{
                s.push(part);
            }
        }
        StringBuilder result=new StringBuilder();
        for(String dir:s){
            result.append("/").append(dir);
        }
         if (result.length() == 0) {
            return "/";
        }

return result.toString();
        
    }
}