import java.util.*;

class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> vowels = new ArrayList<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels.add(ch);
            }
        }
        
        Collections.sort(vowels);
        StringBuilder sb = new StringBuilder(s);
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                sb.setCharAt(i, vowels.get(j));
                j++;
            }
        }
        
        return sb.toString();
    }
}
