class Solution {
    public int minLength(String s) {
        Stack<Character> mp= new Stack<>();
        for(char ch: s.toCharArray()){
            if (!mp.isEmpty() && 
                ((ch == 'B' && mp.peek() == 'A') || (ch == 'D' && mp.peek() == 'C'))) {
                mp.pop();
            }
            else{
                mp.push(ch);
            }
        }
        return mp.size();
    }
}