class Solution {
    public int titleToNumber(String columnTitle) {
        int number=0;
        int sum= 0;
        int c= columnTitle.length();
        for(int i=0;i<columnTitle.length();i++){
            number= (int)(columnTitle.charAt(i))-(int)'A'+1;
            sum= sum + (number* (int)Math.pow(26,c-1));
            c--;
        }
        return sum;
    }
}