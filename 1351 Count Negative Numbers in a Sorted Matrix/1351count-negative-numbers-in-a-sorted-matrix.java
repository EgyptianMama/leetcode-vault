class Solution {
    public int countNegatives(int[][] grid) {
        int start, end,mid,i, j,n=0,temp=0,c=0;
        int m= grid.length;

        for(i=0;i<m;i++){
            n= grid[i].length;
            for(j=0;j<n;j++){
                if(grid[i][j]<0){
                    c=c+n-j;
                    break;
                }
            }
        }
        return c;
    }
}