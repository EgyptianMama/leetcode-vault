class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);

        List<Integer> res = new ArrayList<>();
        int f = 0;

        for (int value = nums[0]; value <= nums[nums.length - 1]; value++) {
            if (f < nums.length && value == nums[f]) {
                f++;
            } else {
                res.add(value);
            }
        }

        return res;
    }
}
