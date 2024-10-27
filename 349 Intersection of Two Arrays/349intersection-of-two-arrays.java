class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> mp= new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    mp.add(nums1[i]);
                }
            }
        }
        int n= mp.size();
        int[] arr= new int[n];
        int i=0;
        for(int x: mp){
            arr[i++]=x;
        }

        return arr;
    }
}