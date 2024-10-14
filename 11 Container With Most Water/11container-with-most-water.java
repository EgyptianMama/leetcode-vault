class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1,a=0,w=0;
        while(l<r){
            a= Math.max(a,(r-l)*Math.min(height[l],height[r]));
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return a;
    }
}