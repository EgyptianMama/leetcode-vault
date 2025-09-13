class Solution {
    public int maxFreqSum(String s) {
        int maxV = 0, maxC = 0;
        Map<Character, Integer> mp = new HashMap<>();

        for (char c : s.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);

            if (isVowel(c)) {
                maxV = Math.max(maxV, mp.get(c));
            } else {
                maxC = Math.max(maxC, mp.get(c));
            }
        }

        return maxV + maxC;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
