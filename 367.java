//https://leetcode.com/problems/valid-perfect-square/

class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<1) return false;
        long start =1,end =num;
        while(start<=end){
            long mid = start + (end - start)/2;
            long square = mid * mid;
            if(square == num) return true;
            else if(square < num) start = mid +1;
            else end = mid -1;
        }
        return false;
        
    }
}
