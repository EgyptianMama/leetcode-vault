class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<Integer> curr= new ArrayList<>();
        List<List<Integer>> res= new ArrayList<>();
        int n= nums.length;
        helper(nums, 0, curr, res);
        return res;
    }
    public void helper(int[] nums, int idx, List<Integer> curr, List<List<Integer>> res){
        if(curr.size()>=2){
            res.add(new ArrayList<>(curr));
        }
        HashSet<Integer> st= new HashSet<>();
        for(int i=idx; i<nums.length; i++){
            if((curr.isEmpty() || nums[i]>=curr.get(curr.size()-1)) && !st.contains(nums[i])){
                curr.add(nums[i]);
                helper(nums, i + 1, curr, res);
                curr.remove(curr.size() - 1);

                st.add(nums[i]);
            }
        }
    }
}
