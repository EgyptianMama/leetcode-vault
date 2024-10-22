class Solution {
    public int arrangeCoins(int n) {
        int c=0;
        if(n==1){
            return 1;
        }
        for(int i=1;i<=n;i++){
            if(n<i){
                break;
            }
            n=n-i;
            c++;
        }
        return c;
    }
}