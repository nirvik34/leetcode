//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;++i){
            int comp = target - nums[i];
            int index = binary(nums,i+1,nums.length -1,comp);
            if(index!=-1){
                return new int[] {i+1,index+1};
            }
        }
        return new int[] {-1,-1};
        
    }
    public int binary(int[] nums,int start,int end,int target){
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                end = mid -1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}
