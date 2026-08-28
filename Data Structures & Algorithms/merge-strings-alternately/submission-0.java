class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int start=0;
        int end=0;
        while(start<word1.length() && end<word2.length()){
            sb.append(word1.charAt(start));
            sb.append(word2.charAt(end));
            start++;
            end++;
        }
        while(start<word1.length()){
            sb.append(word1.charAt(start));
            start++;
        }
        while(end<word2.length()){
            sb.append(word2.charAt(end));
            end++;
        }
        return sb.toString();
        
    }
}