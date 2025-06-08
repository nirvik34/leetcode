class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceSum = findSum(aliceSizes,aliceSizes.length);
        int bobSum = findSum(bobSizes,bobSizes.length);
        int diff = (aliceSum - bobSum)/2;
        Arrays.sort(bobSizes);
        for(int aliceSize: aliceSizes){
            int target = aliceSize - diff;
            if(search(bobSizes,target)){
                return new int[] {aliceSize,target};
            }
        }
        throw new IllegalArgumentException();
    }
    public int findSum(int [] nums,int len){
        int sum = 0;
        for(int i=0;i<len;++i){
            sum+=nums[i];

        }
        return sum;
    }
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid]==target){
                return true;
            }else if(nums[mid]>target){
                end = mid-1;

            }else{
                start = mid+1;
            }
        }
        return false;
    }
}
