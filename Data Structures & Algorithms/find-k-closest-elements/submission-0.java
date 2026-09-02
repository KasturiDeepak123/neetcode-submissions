class vertiv{
    int distance;
    int idx;
    vertiv(int distance,int idx){
        this.distance=distance;
        this.idx=idx;
    }
}
class Solution {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<vertiv> queue=new PriorityQueue<>((a,b)->{
            if(a.distance==b.distance){
                return b.idx-a.idx;
            }
            return b.distance-a.distance;
        });
        for(int i=0;i<arr.length;i++){
            queue.add(new vertiv(Math.abs(arr[i]-x),i));
            if(queue.size()>k){
                queue.poll();
            }
        }
        List<Integer> list=new ArrayList<>();
        while(!queue.isEmpty()){
            list.add(arr[queue.poll().idx]);
        }
        Collections.sort(list);
        return list;

        
    }
}