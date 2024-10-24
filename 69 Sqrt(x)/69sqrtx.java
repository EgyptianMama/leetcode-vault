class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1){
            return x;
        }
        int f=1;
        int l=x/2+1;
        int m=-1;

        while(f<=l){
            m= f+ (l-f)/2;
            if((long)m*m>(long)x){
                l= m-1;
            }
            else if(m*m == x){
                return m;
            }
            else{
                f= m+1;
            }
        }
        return Math.round(l);
    }
}