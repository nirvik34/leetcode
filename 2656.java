class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int score =0;
        int max = nums[nums.length -1];
        for(int i=0;i<k;i++){
            score+= max;
            max+=1;
        }
        return score;
        
    }
}
