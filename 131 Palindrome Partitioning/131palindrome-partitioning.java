import java.util.*;

class Solution {
    public List<List<String>> partition(String s) {
        int idx = 0;
        List<List<String>> result = new ArrayList<>();
        List<String> curr = new ArrayList<>();
        helper(s, idx, result, curr);
        return result;
    }

    public boolean palindromeCheck(String str) {
        int i = 0, j = str.length() - 1;
        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public void helper(String s, int idx, List<List<String>> result, List<String> curr) {
        if (idx == s.length()) {
            result.add(new ArrayList<>(curr)); 
            return;
        }

        for (int i = idx; i < s.length(); i++) {
            String sub = s.substring(idx, i + 1);

            if (palindromeCheck(sub)) {
                curr.add(sub);
                helper(s, i + 1, result, curr);
                curr.remove(curr.size() - 1); 
            }
        }
    }
}