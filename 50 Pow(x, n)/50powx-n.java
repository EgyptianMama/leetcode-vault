class Solution {
    int ans=1;
    public double myPow(double x, int n){
        long N=n;

        if(N<0){
            N=-N;
            x=1/x;
        }

        return helperPow(x,N);
    }

    public double helperPow(double x, long N) {
        if(N==0) return 1;
        if(N%2==0){
            return helperPow(x*x,N/2);
        }
        else{
            return x* helperPow(x,N-1);
        }
    }
}