class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int m= matrix.length;
        int n= matrix[0].length;
        int maxArea=0;

        List<Pair<Integer,Integer>> prevHeights = new ArrayList<>();
        int result=0;

        for(int row=0; row<m; row++){
            List<Pair<Integer,Integer>> currHeight= new ArrayList<>();
            boolean[] check= new boolean[n];

            for(Pair<Integer, Integer> entry:prevHeights){
                int height= entry.getKey();
                int col= entry.getValue();
                if(matrix[row][col] ==1){
                    currHeight.add(new Pair<>(height+1, col));
                    check[col]= true;
                }
            }

            for(int col=0;col<n;col++){
                if(!check[col] && matrix[row][col] == 1){
                    currHeight.add(new Pair<>(1,col));
                }
            }

            for(int i=0;i<currHeight.size();i++){
                int base= i+1;
                int height= currHeight.get(i).getKey();
                result = Math.max(result, base*height);
            }

            prevHeights= currHeight;
        }
        return result;
    }
}