class Solution {
    public int maxArea(int[] heights) {
        int start=0;
        int end=heights.length-1;
        int max_water=0;
        while(start<end){
            int h=Math.min(heights[start],heights[end]);
            int w=end-start;
            int area=h*w;
            max_water=Math.max(area,max_water);
            if(heights[start]<heights[end]){
                start++;
            }
            else{
                end--;
            }

        }
        return max_water;
    
    }
}
