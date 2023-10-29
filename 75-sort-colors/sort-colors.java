class Solution {
    public void sortColors(int[] nums) {
        int i=0, j=0, k=nums.length-1;

        while(j<=k){
            if(nums[j]==2){
                swap(nums, j, k);
                k--;
            }
            else if(nums[j]==0){
                swap(nums, i,j);
                i++;
                j++;
            }
            else j++;
        }
    }

    void swap(int[] nums, int l, int r){
        int temp= nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }
}