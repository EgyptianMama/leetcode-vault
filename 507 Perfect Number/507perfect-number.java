class Solution {
    public boolean checkPerfectNumber(int num) {
        int t=0;
        int n=num;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                t=t+i;
            }
        }
        return t==n;
    }
}