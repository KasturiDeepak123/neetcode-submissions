class Solution {
    public int firstMissingPositive(int[] nums) {
        int number=1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(number==nums[i]){
                number++;
            }
            else if(nums[i]>number){
                return number;
            }
        }
        return number;
        
    }
}