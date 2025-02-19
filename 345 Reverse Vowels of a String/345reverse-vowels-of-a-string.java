class Solution {
    public String reverseVowels(String s) {
        if(s==" ") return s;
        s.trim();
        char[] str= s.toCharArray();
        Stack<Character> stk= new Stack<>();
        for(int i=0;i<str.length;i++){
            if(str[i]=='A' || str[i]=='E' || str[i]=='I' || str[i]=='O' || str[i]=='U' || str[i]=='a' || str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u'){
                stk.push(str[i]);

            }
        }
        for(int i=0;i<str.length;i++){
            if(str[i]=='A' || str[i]=='E' || str[i]=='I' || str[i]=='O' || str[i]=='U' || str[i]=='a' || str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u'){
                char ch= stk.pop();
                str[i]=ch;
        }
    }
    String ans= new String(str);
        return ans;
}
}