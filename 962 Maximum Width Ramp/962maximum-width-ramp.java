class Solution {
    public int maxWidthRamp(int[] nums) {
        Stack<Integer> stack= new Stack<>();
        int n= nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            if(stack.isEmpty() || nums[stack.peek()]>nums[i]){
                stack.push(i);
            }
        }
        for(int i=n-1;i>0;i--){
            while(!stack.isEmpty() && nums[stack.peek()]<= nums[i]){
                ans= Math.max(ans,i-stack.pop());
            }
            if(stack.isEmpty()){
                break;
            }
        }
        return ans;
    }
}