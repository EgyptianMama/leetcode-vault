class Solution {
    public int[] runningSum(int[] nums) {
        int sum= nums[0];
        int l= nums.length;
        int[] arr= new int[l];
        arr[0]= sum;
        for(int i= 1;i<nums.length;i++){
            arr[i]= sum+ nums[i];
            sum= sum+ nums[i];
        }   

        return arr;
    }
}