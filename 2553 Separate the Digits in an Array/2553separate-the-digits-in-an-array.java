class Solution {
    public int[] separateDigits(int[] nums) {
        String res= "";
        for(int i=0;i<nums.length;i++){
            int temp= nums[i];
            String str = Integer.toString(temp);
            res= res+ str;
        }
        int[] ans= new int[res.length()];
        for(int i=0;i<res.length();i++){
            ans[i]= res.charAt(i)-'0';
        }
        return ans;
    }
}