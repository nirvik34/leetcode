class Solution {
    public int findMaxFish(int[][] grid) {
        int maxScore =0;
        for(int row=0;row<grid.length;row++){
            for(int cols = 0;cols<grid[0].length;cols++){
                if(grid[row][cols]>0){
                        maxScore=Math.max(maxScore,find(grid,row,cols));
                    
                }
                
            }
        }
        return maxScore;
        
    }
    public int find(int[][] grid,int r,int c){
        if(r<0||r>=grid.length||c<0||c>=grid[0].length||grid[r][c]==0){
            return 0;
        }
        int fish = grid[r][c];
        grid[r][c] = 0;
        fish += find(grid,r+1,c);
        fish += find(grid,r-1,c);
        fish += find(grid,r,c+1);
        fish += find(grid,r,c-1);
        return fish;
    }
}
