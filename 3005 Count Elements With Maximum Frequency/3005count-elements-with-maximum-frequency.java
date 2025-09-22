class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int initialCount = 1;
        int maxCount = 0;
        int ret = 0;
        for(int i=0;i<nums.length;i++) {
             if (countMap.containsKey(nums[i])) {
                int count = countMap.get(nums[i]);
                count++;
                countMap.put(nums[i], count);
                if (maxCount<count) {
                    maxCount = count;
                }
             } else {
                countMap.put(nums[i], initialCount);
             }
             
        }
        if (maxCount == 0) {
            maxCount = 1;
        }
        for(Integer i : countMap.keySet()) {
            if (maxCount == countMap.get(i)) {
                ret += maxCount;
            }
        }
        return ret;
    
    }
}