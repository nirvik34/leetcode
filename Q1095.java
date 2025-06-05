//https://leetcode.com/problems/find-in-mountain-array/description/

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakElement(mountainArr);
        int firstTry = orderBinary(mountainArr,target,0,peak);
        if(firstTry!=-1){
            return firstTry;
        }
        return orderBinary(mountainArr,target,peak+1,mountainArr.length()-1);

        
    }
    public int peakElement(MountainArray mountainArr){
        int start =0;
        int end = mountainArr.length()-1;
        while(start<end){
            int mid = start + (end - start)/2;
            if(mountainArr.get(mid) < mountainArr.get(mid + 1)){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
    }
    public int orderBinary(MountainArray mountainArr,int target,int start,int end){
        boolean isAsc = mountainArr.get(start)<mountainArr.get(end);
        while(start<=end){
            int mid = start + (end - start)/2;
            if(mountainArr.get(mid)== target){
                return mid;
            }
            if(isAsc){
                if(target<mountainArr.get(mid)){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(target>mountainArr.get(mid)){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
