class Solution {
    public int findDuplicate(int[] nums) {
        int i =0;
        while(i<nums.length){
            if(nums[i]!=i+1){
                int current = nums[i]-1;
                if(nums[i] != nums[current]){
                    swap(nums,i,current) ;
                }else{
                    return nums[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
        
    }
    public void swap(int[] arr,int first,int second){
        int temp =arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
