class Solution {
    int first=0;
    public int removeElement(int[] nums, int val) {
       for(int i=0;i<nums.length;i++){
         if(nums[i]!=val){
            nums[first]=nums[i];
            first++;
        }
        

       }
       
        return first;

    }
}