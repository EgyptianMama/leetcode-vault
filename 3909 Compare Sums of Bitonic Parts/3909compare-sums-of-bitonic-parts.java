class Solution {
    public int compareBitonicSums(int[] nums) {
        int n = nums.length;

        // 1. find peak index
        int peak = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[peak]) {
                peak = i;
            }
        }

        long sasc = 0;
        long sdsc = 0;

        // 2. ascending part (including peak)
        for (int i = 0; i <= peak; i++) {
            sasc += nums[i];
        }

        // 3. descending part (including peak)
        for (int i = peak; i < n; i++) {
            sdsc += nums[i];
        }

        // 4. compare
        if (sasc == sdsc) return -1;
        else if (sasc > sdsc) return 0;
        else return 1;
    }
}