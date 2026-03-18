class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> mp= new HashMap<>();
        
        for(int i=0;i< nums2.length;i++){
            int currElement= nums2[i];
            for(int j= i; j< nums2.length; j++){
                if(currElement< nums2[j]){
                    mp.put(currElement,nums2[j]); 
                    break;
                }
                else{
                    mp.put(currElement,-1); 
                }
            }
        }
        int[] ans = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int currVal= mp.get(nums1[i]);
            if(currVal > -1) ans[i]= currVal;
            else ans[i] = -1;
        }
        return ans;
    }
}