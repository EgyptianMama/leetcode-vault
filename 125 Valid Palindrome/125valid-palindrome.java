class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sr = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sr.append(Character.toLowerCase(ch));
            }
        }
        return sb.toString().equals(sr.toString());
    }
}
