class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int start=0;
        Arrays.sort(nums);
        List<List<Integer>> mainlist=new ArrayList<>();
        while(start<nums.length-2){
            if(start>0 && nums[start]==nums[start-1]){
                start++;
                continue;
            }
            int next=start+1;
            int end=nums.length-1;
            while(next<end){
                int sum=nums[start]+nums[end]+nums[next];
                if(sum==0){
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[start]);
                    list.add(nums[next]);
                    list.add(nums[end]);
                    mainlist.add(list);
                    next++;
                    end--;
                    while(next<end && nums[next]==nums[next-1]){
                        next++;
                    }
                    while(next<end && nums[end]==nums[end+1]){
                        end--;
                    }
                }
                else if(sum<0){
                    next++;
                }
                else{
                    end--;
                }

            }
            start++;
            
        }
        return mainlist;
        
    }
}
