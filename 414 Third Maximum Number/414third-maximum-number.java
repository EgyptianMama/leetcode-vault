class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        Set<Integer> set = new LinkedHashSet<>();
        for (int i=0;i<nums.length;i++) {
            set.add(nums[i]);
        }
        System.out.println(set);
        List<Integer> list = new ArrayList<>(set);
        System.out.println(list);
        if (list.size() >= 3) {
            return list.get(list.size() - 3); 
        } else {
            return list.get(list.size() - 1);  
        }
    }
}