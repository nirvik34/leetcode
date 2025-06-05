//https://leetcode.com/problems/search-in-rotated-sorted-array/description/

class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if(pivot == -1){
            return binary(nums,target,0,nums.length -1);
        }
        if(nums[pivot] == target){
            return pivot;
        }else if(nums[0]<=target){
            return binary(nums,target,0,pivot-1);
        }
        return binary(nums,target,pivot+1,nums.length-1);
    }
    public int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            //case 1
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid>start && arr[mid]<arr[mid-1]){
                return mid -1;
            }else if(arr[mid]>=arr[start]){
                start = mid + 1;
            }else{
                end = mid-1;
            }
        

        }
        return -1;
    }
    public int binary(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid= start + (end -  start)/2;
            if(arr[mid]>target){
                end = mid -1;
            }else if(arr[mid]<target){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
