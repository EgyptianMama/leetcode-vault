class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashMap<Integer, Integer> mp1= new HashMap<>();
        HashMap<Integer, Integer> mp2= new HashMap<>();
        int count=0;
        int[] ans= new int[A.length];
        for(int i=0;i<A.length;i++){
            mp1.put(A[i],i);
            mp2.put(B[i],i);
            for(int j=0;j<=i;j++){
                if(mp2.containsKey(A[j])) count++;
            }
            ans[i]= count;
            count =0;
        }

        return ans;
    }
}