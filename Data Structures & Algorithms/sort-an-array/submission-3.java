class Solution {
    void mergeSort(int[] nums,int start,int mid,int end){
        int[] temp=new int[end-start+1];
        int i=start;
        int j=mid+1;
        int k=0;
        while(i<=mid  && j<=end){
            if(nums[i]<nums[j]){
                temp[k]=nums[i];
                i++;
            }
            else{
                temp[k]=nums[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k]=nums[i];
            i++;
            k++;
        }
        while(j<=end){
            temp[k]=nums[j];
            k++;
            j++;
        }
        for(int p=0;p<temp.length;p++){
            nums[start+p]=temp[p];
        }
    }
    void merge(int[] nums,int start,int end){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        merge(nums,start,mid);
        merge(nums,mid+1,end);
        mergeSort(nums,start,mid,end);
    }
    public int[] sortArray(int[] nums) {
        merge(nums,0,nums.length-1);
        return nums;
        
    }
}