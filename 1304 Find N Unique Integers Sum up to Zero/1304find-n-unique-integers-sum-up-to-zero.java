class Solution {
    public int[] sumZero(int n) {
        int[] ans= new int[n];
        int j=0;
        for(int i= -(n/2); i<=(n/2);i++){
            if(i==0) continue;
            else{
                ans[j]=i;
                j++;
            }
        }
        return ans;
    }
}