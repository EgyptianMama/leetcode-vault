class Solution {
    public void rotate(int[][] matrix) {
        int len= matrix.length;
        int t=0;
        int[][] temp= new int[len][len];
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                temp[i][j]=matrix[j][i];
            }
        }
        for(int i=0;i<len;i++){
            for(int j=0;j<len/2;j++){
                t= temp[i][j];
                temp[i][j]=temp[i][len-j-1];
                temp[i][len-j-1]= t;
            }
        }
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                matrix[i][j]= temp[i][j];
            }   
        }

    }
} 