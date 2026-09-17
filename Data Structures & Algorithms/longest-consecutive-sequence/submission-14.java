class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<1){
            return 0;
        }
        else{
            Arrays.sort(nums);
        }
        int maxSize=1;
        HashSet<Integer> set=new HashSet<>();
        set.add(nums[0]);
        int number=nums[0];
        for(int i=1;i<nums.length;i++){
            if(set.contains(nums[i])){
                continue;
            }
            number++;
            if(!set.contains(nums[i]) && nums[i]==number){
                set.add(nums[i]);
                maxSize=Math.max(set.size(),maxSize);
            }
            else {
                
                set.clear();
                set.add(nums[i]);
                number=nums[i];
            }
            
            
           
        }
        return maxSize;

        
    }
}
