class Solution {
    public boolean validDigit(int n, int x) {
        boolean check= false;
        int num=n;
        String s = String.valueOf(num);
        if(s.charAt(0)== (char)(x+'0')) return false;

        while(n>0){
            int temp= n%10;
            if(temp== x){
                return true;
            }
            n=n/10;
        }
        return false;
    }
}