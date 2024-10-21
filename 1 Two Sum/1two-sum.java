class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> a = new HashMap<>();
        int[] ans= new int[2];
        int c=0;
        for(int i=0;i<nums.length;i++){
            a.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            c=target-nums[i];
            if(a.containsKey(c) && a.get(c)!=i){
                ans[0]=i;
                ans[1]=a.get(c);
                return ans;
            }
        }
        return ans;
    }
}