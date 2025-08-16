class Solution {
    public int reverse(int x) {
        int r = 0; // declare result variable
        while (x != 0) {
            int digit = x % 10; // extract last digit

            // check overflow before updating r
            if (r > Integer.MAX_VALUE / 10 || (r == Integer.MAX_VALUE / 10 && digit > 7))
                return 0;
            if (r < Integer.MIN_VALUE / 10 || (r == Integer.MIN_VALUE / 10 && digit < -8))
                return 0;

            r = r * 10 + digit; // build reversed number
            x = x / 10; // update x
        }
        return r; // return if in 32-bit range
    }
}
