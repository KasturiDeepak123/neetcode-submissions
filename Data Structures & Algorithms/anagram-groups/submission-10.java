class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> result=new HashMap<>();
        for(String str:strs){
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String s=new String(ch);
            result.putIfAbsent(s,new ArrayList<>());
            result.get(s).add(str);
        }
        return new ArrayList<>(result.values());
        
    }
}
