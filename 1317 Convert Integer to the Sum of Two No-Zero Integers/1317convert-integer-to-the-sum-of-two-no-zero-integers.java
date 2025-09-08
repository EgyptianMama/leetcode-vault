class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i=1; i<n;i++){
            if(checkZero(i) && checkZero(n-i)) return new int[] {i,n-i};
        }

        return new int[] {-1,-1};
    }
    public boolean checkZero(int n){
        int num= n;
        while(num>0){
            if(num%10 == 0) return false;
            num= num/10;
        }

        return true;
    }
}