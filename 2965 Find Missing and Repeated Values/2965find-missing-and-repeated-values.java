class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n= grid.length;
        int[] check= new int[n*n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int val= grid[i][j];
                check[val-1]++;
                
            }
        }
        
        int high=-1;
        int low=-1;
        for(int i=0;i<check.length;i++){
            if(check[i]==0) low= (i+1);
            if(check[i]>1) high= (i+1);
        }

        return new int[]{high,low};
    }
}