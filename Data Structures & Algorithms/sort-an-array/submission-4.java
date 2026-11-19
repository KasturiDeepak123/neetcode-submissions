class Solution {
    void mergeSort(int[] nums,int left,int mid,int right){
        int[] temp=new int[right-left+1];
        int i=left;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=right){
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
        while(j<=right){
            temp[k]=nums[j];
            j++;
            k++;
        }
        for(int r=0;r<temp.length;r++){
            nums[r+left]=temp[r];
        }
    }
    void merge(int[] nums,int left,int right){
        if(left>=right){
            return;
        }
        int mid=left+(right-left)/2;
        merge(nums,left,mid);
        merge(nums,mid+1,right);
        mergeSort(nums,left,mid,right);

    }
    public int[] sortArray(int[] nums) {
        merge(nums,0,nums.length-1);
        return nums;
        
    }
}