class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        helper(0, candidates, target, new ArrayList<>(), res);
        return res;
    }

    private void helper(int index, int[] arr, int target,List<Integer> curr, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }
        
        if (index == arr.length || target < 0) {
            return;
        }
        curr.add(arr[index]);
        helper(index, arr, target - arr[index], curr, res);
        curr.remove(curr.size() - 1);
        helper(index + 1, arr, target, curr, res);
    }
}