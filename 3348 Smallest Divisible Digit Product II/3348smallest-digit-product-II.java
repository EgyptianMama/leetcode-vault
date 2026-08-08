class Solution {

    int[][] f = {
        {0,0,0,0}, {0,0,0,0}, {1,0,0,0}, {0,1,0,0},
        {2,0,0,0}, {0,0,1,0}, {1,1,0,0}, {0,0,0,1},
        {3,0,0,0}, {0,2,0,0}
    };

    public String smallestNumber(String num, long t) {

        int[] need = new int[4];
        int[] p = {2,3,5,7};
        for (int i = 0; i < 4; i++) {
            while (t % p[i] == 0) {
                need[i]++;
                t /= p[i];
            }
        }

        if (t != 1) return "-1";

        int[] have = new int[4];
        int firstZero = num.length();
        for (int i = 0; i < num.length(); i++) {
            int d = num.charAt(i) - '0';

            if (d == 0) {
                firstZero = Math.min(firstZero, i);
                continue;
            }

            add(have, f[d]);
        }
        if (firstZero == num.length() && enough(have, need))
            return num;
        for (int i = num.length() - 1; i >= 0; i--) {

            int old = num.charAt(i) - '0';

            if (old != 0)
                remove(have, f[old]);

            if (i > firstZero) continue;

            for (int d = old + 1; d <= 9; d++) {

                int[] rem = remaining(need, have, f[d]);

                String suffix = build(rem);

                if (suffix.length() <= num.length() - i - 1) {

                    int ones =
                        num.length() - i - 1 - suffix.length();

                    return num.substring(0, i)
                            + d
                            + "1".repeat(ones)
                            + suffix;
                }
            }
        }

        String suffix = build(need);

        int ones = Math.max(
            0,
            num.length() + 1 - suffix.length()
        );

        return "1".repeat(ones) + suffix;
    }

    String build(int[] a) {

        int x = a[0];
        int y = a[1];
        int z = a[2];
        int w = a[3];

        StringBuilder s = new StringBuilder();
        s.append("5".repeat(z));
        s.append("7".repeat(w));

        while (x >= 3) {
            s.append('8');
            x -= 3;
        }
        while (y >= 2) {
            s.append('9');
            y -= 2;
        }

        if (x == 1 && y == 1) {
            s.append('6');
            x--;
            y--;
        }

        if (x == 2 && y == 1) {
            s.append("26");
            x = 0;
            y = 0;
        }

        if (x == 2) s.append('4');
        else if (x == 1) s.append('2');

        if (y == 1) s.append('3');

        char[] arr = s.toString().toCharArray();
        java.util.Arrays.sort(arr);

        return new String(arr);
    }


    int[] remaining(int[] need, int[] have, int[] digit) {

        int[] r = new int[4];

        for (int i = 0; i < 4; i++)
            r[i] = Math.max(
                0,
                need[i] - have[i] - digit[i]
            );

        return r;
    }


    void add(int[] a, int[] b) {
        for (int i = 0; i < 4; i++)
            a[i] += b[i];
    }


    void remove(int[] a, int[] b) {
        for (int i = 0; i < 4; i++)
            a[i] -= b[i];
    }


    boolean enough(int[] have, int[] need) {

        for (int i = 0; i < 4; i++)
            if (have[i] < need[i])
                return false;

        return true;
    }
}
