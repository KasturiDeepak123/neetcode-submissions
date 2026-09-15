class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String s:strs){
            sb.append(s.length());
            sb.append("#");
            sb.append(s);
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
        int i=0;
        List<String> list=new ArrayList<>();
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int len=Integer.parseInt(str.substring(i,j));
            j++;
            String current=str.substring(j,j+len);
            list.add(current);
            i=j+len;
        }
        return list;


    }
}
