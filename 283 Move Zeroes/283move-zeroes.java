class Solution {
    public void moveZeroes(int[] nums) {
        Stack<Integer> stack= new Stack<>();
        int n= nums.length;
        int c=0,temp=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                stack.push(nums[i]);
            }
            else{
                c++;
            }
        }
        int[] arr= new int[n-c];
        for(int i=n-c-1;i>=0;i--){
            arr[i]= stack.pop();
        }
        
        for(int i=0;i<n-c;i++){
            nums[i]= arr[i];
        }
        for(int i=n-c;i<n;i++){
            nums[i]=0;
        }
    }
}