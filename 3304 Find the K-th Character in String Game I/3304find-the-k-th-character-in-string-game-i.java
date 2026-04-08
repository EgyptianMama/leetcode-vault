class Solution {
    public char kthCharacter(int k) {
        String res = helper("a", k);
        return res.charAt(k - 1);
    }

    public String helper(String str, int k) {
        if (str.length() >= k) {
            return str;
        }

        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            sb.append((char)(temp + 1));
        }

        return helper(sb.toString(), k);
    }
}
