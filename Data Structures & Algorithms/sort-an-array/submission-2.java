class Solution {
    void mergeSort(int[] nums,int start,int mid,int end){
        int[] temp=new int[end-start+1];
        int i=start;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=end){
            if(nums[i]<nums[j]){
                temp[k]=nums[i];
                i++;
                k++;
            }
            else{
                temp[k]=nums[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            temp[k]=nums[i];
            k++;
            i++;
        }
        while(j<=end){
            temp[k]=nums[j];
            j++;
            k++;
        }
        for(int s=0;s<temp.length;s++){
            nums[start+s]=temp[s];
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