class Solution {
    public int[] findPeakGrid(int[][] mat) {
       int start = 0;
       int end = mat[0].length -1;
       while(start <=  end){
        int mid = start +  (end -start)/2;
        int row = findMax(mat,mid);
        int leftNeighbour = (mid>0)?mat[row][mid-1] : -1;
        int rightNeighbour = (mid < mat[0].length-1)? mat[row][mid+1]:-1;
        if(mat[row][mid]>leftNeighbour && mat[row][mid]>rightNeighbour){
            return new int[]{row,mid};
        }
        if(leftNeighbour > mat[row][mid]){
            end = mid-1;
        }else{
            start = mid+1;
        }

       } 
       return new int[]{-1,-1};
    }
    public int findMax(int[][] mat,int col){
        int maxRow = 0;
        for(int i=0;i<mat.length;++i){
            if(mat[i][col] > mat[maxRow][col]){
                maxRow =i;
            }
        }
        return maxRow;

        

    }
}
