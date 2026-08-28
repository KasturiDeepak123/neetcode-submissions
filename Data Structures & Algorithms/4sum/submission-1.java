class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int first=0;
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        while(first<nums.length-3){
            if(first>0 && nums[first]==nums[first-1]){
                first++;
                continue;
            }
            int second=first+1;
            while(second<nums.length-2){
                if(second>first+1 && nums[second]==nums[second-1]){
                    second++;
                    continue;
                }
                int left=second+1;
                int right=nums.length-1;
                while(left<right){
                long sum=(long)nums[first]+nums[second]+nums[left]+nums[right];
                if(sum==target){
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    result.add(list);
                    left++;
                    right--;
                    while(left<right && nums[left]==nums[left-1]){
                        left++;

                    }
                    while(left<right && nums[right]==nums[right+1]){
                        right--;
                    }
                }
                else if(sum<target){
                    left++;
                }
                else{
                    right--;
                }
                
               
            }
            second++;
        }
        first++;

        
    }
    return result;
}
}