class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        map.put(0,1);
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int previous_prefix=sum-k;
            if(map.containsKey(previous_prefix)){
                count+=map.get(previous_prefix);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
        
    }
}