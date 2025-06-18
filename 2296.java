class Solution {
    public int[][] divideArray(int[] nums, int k) {
        //bubbleSort(nums);
        Arrays.sort(nums);
        int n = nums.length;
        int num = n/3;
        if(n%3!=0){
            return new int[0][0];
        }
        int[][] ans = new int[num][3];
        for(int i=0;i<num;++i){
            int index = i*3;
            if(nums[index+2]-nums[index] > k){
                return new int[0][0];
            }
            ans[i][0] = nums[index];
            ans[i][1] = nums[index+1];
            ans[i][2] =  nums[index +2];

        }
        return ans;

        
    }
     public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
