class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len= nums.length;
        int ans1= nums[len-1]*nums[len-2]* nums[len-3];

        int ans2= nums[0]*nums[1]*nums[len-1];

        int ans3= nums[0]*nums[1]*nums[2];

        int res= Math.max(ans1,ans2);
        int result= Math.max(res, ans3);

        return res;
    }
}