class Solution {
    boolean checkAnagram(String s1,String sb){
        char[] ch=s1.toCharArray();
        char[] ch1=sb.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        return Arrays.equals(ch,ch1);
    }
    public boolean checkInclusion(String s1, String s2) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s2.length();i++){
            sb.append(s2.charAt(i));
            if(sb.length()==s1.length()){
                if(checkAnagram(s1,sb.toString())){
                    return true;
                }
                else{
                    sb.deleteCharAt(0);
                }
                

            }
        }
        return false;
        
        
    }
}
