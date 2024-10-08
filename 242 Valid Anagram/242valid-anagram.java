class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int l= s.length();
        char[] s1= new char[l];
        char[] s2= new char[l];
        for(int i=0;i<s.length();i++){
            s1[i]= s.charAt(i);
        }
        for(int i=0;i<s.length();i++){
            s2[i]= t.charAt(i);
        }
        Arrays.sort(s1);
        Arrays.sort(s2);

        boolean check=true;
        for(int i=0;i<l;i++){
            if(s1[i]==s2[i]){
                check=true;
            }
            else return false;
        }

        return check;
    }
}