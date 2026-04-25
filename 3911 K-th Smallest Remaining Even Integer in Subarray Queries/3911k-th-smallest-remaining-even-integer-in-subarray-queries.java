class Solution {
    public int[] kthRemainingInteger(int[] nums, int[][] queries) {
        int n = nums.length;

        int[] clesimvora = nums;

        List<Integer> evenIdx = new ArrayList<>();
        List<Integer> evenVals = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if ((nums[i] & 1) == 0) {
                evenIdx.add(i);
                evenVals.add(nums[i] / 2);
            }
        }

        int q = queries.length;
        int[] ans = new int[q];

        for (int qi = 0; qi < q; qi++) {
            int l = queries[qi][0];
            int r = queries[qi][1];
            int k = queries[qi][2];

            int leftIdx = lowerBound(evenIdx, l);
            int rightIdx = upperBound(evenIdx, r) - 1;

            int left = 1, right = k + (rightIdx - leftIdx + 1) + 5;

            while (left < right) {
                int mid = left + (right - left) / 2;

                int removed = 0;
                if (leftIdx <= rightIdx) {
                    removed = countLE(evenVals, leftIdx, rightIdx, mid);
                }

                int remaining = mid - removed;

                if (remaining >= k) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }

            ans[qi] = left * 2;
        }

        return ans;
    }

    private int lowerBound(List<Integer> list, int target) {
        int l = 0, r = list.size();
        while (l < r) {
            int m = (l + r) / 2;
            if (list.get(m) >= target) r = m;
            else l = m + 1;
        }
        return l;
    }

    private int upperBound(List<Integer> list, int target) {
        int l = 0, r = list.size();
        while (l < r) {
            int m = (l + r) / 2;
            if (list.get(m) > target) r = m;
            else l = m + 1;
        }
        return l;
    }

    private int countLE(List<Integer> list, int l, int r, int target) {
        int low = l, high = r + 1;
        while (low < high) {
            int m = (low + high) / 2;
            if (list.get(m) <= target) low = m + 1;
            else high = m;
        }
        return low - l;
    }
}