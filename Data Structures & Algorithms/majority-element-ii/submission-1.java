class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> list=new ArrayList<>();
        int n=nums.length;
        for(int k:map.keySet()){
            if(map.get(k)>n/3){
                list.add(k);
            }
        }
        return list;
        
    }
}