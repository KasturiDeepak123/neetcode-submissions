class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] count=new int[26];
        for(char ch:s1.toCharArray()){
            count[ch-'a']++;
        }
        int left=0;
        for(int right=0;right<s2.length();right++){
            count[s2.charAt(right)-'a']--;
            if(right-left+1>s1.length()){
                count[s2.charAt(left)-'a']++;
                left++;
            }
            if(right-left+1==s1.length()){
                boolean allZero = true;
                for(int i=0;i<count.length;i++){
                    if(count[i]!=0){
                        allZero=false;
                        break;
                    }
                }
                if (allZero) {
                    return true;
                }

            }
        }
        return false;
        
    }
}
