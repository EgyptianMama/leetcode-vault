class Solution {
    public double largestTriangleArea(int[][] points) {
        int n = points.length;
        double maxArea = 0.0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    double area = Math.abs(
                        (double)(points[i][0] - points[k][0]) * (points[j][1] - points[k][1]) -
                        (double)(points[j][0] - points[k][0]) * (points[i][1] - points[k][1])
                    ) * 0.5;
                    if (area > maxArea) maxArea = area;
                }
            }
        }
        return maxArea;
    }
}