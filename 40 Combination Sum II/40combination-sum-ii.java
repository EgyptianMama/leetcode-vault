class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates); 
        
        backtrack(0, candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }

    public void backtrack(int startIdx, int[] candidates, int target, int currSum, List<Integer> curr, List<List<Integer>> ans) {
        if (currSum == target) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        if (currSum > target) {
            return;
        }
        for (int i = startIdx; i < candidates.length; i++) {
            if (i > startIdx && candidates[i] == candidates[i - 1]) {
                continue;
            }
            curr.add(candidates[i]);
            backtrack(i + 1, candidates, target, currSum + candidates[i], curr, ans);
            curr.remove(curr.size() - 1);
        }
    }
}