class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> a = new ArrayList<>();
        for (int i = 1; i <= n; ++i) {
            a.add(i);
        }
        int start = 0;
        while (a.size() > 1) {
            start = (start + (k - 1)) % a.size();
            a.remove(start);
        }
        return a.get(0);
    }
}