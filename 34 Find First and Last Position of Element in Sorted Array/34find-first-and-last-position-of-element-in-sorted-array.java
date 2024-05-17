class Solution {
    public int[] searchRange(int[] nums, int target) {
        int leftIndex = findLeft(nums, target);
        int rightIndex = findRight(nums, target);
        
        if (leftIndex <= rightIndex) {
            return new int[]{leftIndex, rightIndex};
        } else {
            return new int[]{-1, -1};
        }
    }
    
    private int findLeft(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return left;
    }
    
    private int findRight(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return right;
    }
}