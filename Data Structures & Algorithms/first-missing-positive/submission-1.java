class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int expected=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<expected){
                continue;
            }
            if(nums[i]==expected){
                expected++;
            }
            else if(nums[i]>expected){
                return expected;
            }

            
                
          
        }
        return expected;
        
        
    }
}