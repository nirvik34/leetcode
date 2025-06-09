
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = Arrays.stream(piles).max().getAsInt();
        int result = end;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(check(piles,mid,h)==true){
                result = mid;
                end = mid-1;
                
            }else{
                start = mid+1;
            }

        }
        return result;
    }
    public boolean check(int[]  arr,int mid,int h){
        int hours = 0;
        for(int pile:arr){
            hours+=Math.ceil((double) pile/mid);
        }
        return hours<=h;

    }
}
