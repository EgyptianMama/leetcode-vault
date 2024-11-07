class Solution {
    public int lengthOfLastWord(String s) {
        String str= s.trim();
        int c=0, i= str.length()-1;
        while (i >= 0 && str.charAt(i) != ' ') {
            c++;
            i--;
        }
        return c;
    }
}