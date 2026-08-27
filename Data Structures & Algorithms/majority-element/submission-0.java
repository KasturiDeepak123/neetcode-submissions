class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max=0;
        int idx=-1;
        for(int i:map.keySet()){
            if(map.get(i)>=n/2){
                int val=map.get(i);
                if(val>max){
                    max=val;
                    idx=i;
                }
                

            }
        }
        return idx;
        
    }
}