class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> mp= new HashMap<>();
        for(int i=0; i< nums1.length;i++){
            mp.put(nums1[i], i);
        }
        for(int i=0;i<nums2.length;i++){
            if(mp.containsKey(nums2[i])) return nums2[i];
        }
        return -1;
    }
}