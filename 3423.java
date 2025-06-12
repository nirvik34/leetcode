class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int[] arr = new int[nums.length +1];
        int diff = 0;
        arr[0] = nums[nums.length-1];
        for(int i=1;i<nums.length+1;++i){
            arr[i] = nums[i-1];
        }
        for(int i=0;i<arr.length-1;++i){
            int temp = Math.abs(arr[i]-arr[i+1]);
            if (temp>diff){
                diff = temp;
            }
        }
        return diff;
    }
}
