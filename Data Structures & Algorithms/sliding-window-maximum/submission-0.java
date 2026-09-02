
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<int[]> queue=new PriorityQueue<>((a,b)->{
            return b[0]-a[0];
        });
        int n=nums.length;
        int[] ans=new int[n-k+1];
        for(int i=0;i<k;i++){
            queue.add(new int[]{nums[i],i});
        }
        ans[0]=queue.peek()[0];
        for(int i=k;i<nums.length;i++){
            queue.add(new int[]{nums[i],i});
            int start=i-k+1;
            while(!queue.isEmpty() && queue.peek()[1]<start){
                queue.poll();
            }
            ans[start]=queue.peek()[0];
        }
        return ans;
        
    }
}
