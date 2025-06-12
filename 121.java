class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min =prices[0];

        
        for(int n:prices){
            max = Math.max(max,n-min);
            min =Math.min(min,n);

        }
        return max;
        
    }
}
