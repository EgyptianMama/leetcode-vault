class Solution {
    public boolean isValid(String s) {
        Stack<Character> g= new Stack<>();

        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);

            if(c==']' || c=='}' || c==')'){
                if(g.isEmpty()) return false;
                char top= g.peek();
                if((c==')' && top=='(')||
                   (c=='}' && top=='{')||
                   (c==']' && top=='[')){
                    g.pop();
                   }
                else return false;
            }
            else g.push(c);
        }
        return g.isEmpty();
    }
}