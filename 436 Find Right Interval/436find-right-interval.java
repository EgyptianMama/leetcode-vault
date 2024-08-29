import java.util.*;

class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[] ans = new int[n];
        List<int[]> map = new ArrayList<>();

        // Store the start times and their original indices
        for (int i = 0; i < n; i++) {
            map.add(new int[]{intervals[i][0], i});
        }

        // Sort the map based on the start times
        map.sort((a, b) -> Integer.compare(a[0], b[0]));

        // For each interval, perform binary search to find the right interval
        for (int i = 0; i < n; i++) {
            int l = 0, r = n - 1;
            int target = intervals[i][1];

            while (l <= r) {
                int mid = l + (r - l) / 2;
                if (map.get(mid)[0] >= target) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }

            // If a valid interval is found, assign its index; otherwise, assign -1
            if (l < n) {
                ans[i] = map.get(l)[1];
            } else {
                ans[i] = -1;
            }
        }

        return ans;
    }
}
