class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int longest=0;
         for (int num : nums) {
            set.add(num);
        }
        for(int i:set){
            if(!set.contains(i-1)){
                int current=i;
                int count=1;
                while(set.contains(current+1)){
                    count++;
                    current++;
                }
                longest=Math.max(count,longest);
            }
        }
        return longest;
        
    }
}

