class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->{
            return map.get(a)-map.get(b);
            
        });
        for(int i:map.keySet()){
            pq.add(i);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int i=0;
        int[] arr=new int[k];
        while(!pq.isEmpty()){
            arr[i++]=pq.poll();
        }
        return arr;
        
    }
}
