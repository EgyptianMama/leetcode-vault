class Solution {
    public int countDigitOne(int n) {
        if (n == 0) {
            return 0;
        } else if (n <= 9) {
            return 1;
        }
        
        int len = (int) Math.log10(n) + 1;
        int base = (int) Math.pow(10, len - 1);
        int mult = n / base;
        int rem = n % base;
        int noOfOnesInBase = 0;

        if (mult == 1) {
            noOfOnesInBase = n - base + 1;
        } else {
            noOfOnesInBase = base;
        }
        
        return countDigitOne(base - 1) * mult + noOfOnesInBase + countDigitOne(rem);
    }
}
