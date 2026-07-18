class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int len= nums.length;
        int s= nums[0];
        int l= nums[len-1];
        
        int res= gcd(s,l);
        return res;
    }

    public int gcd(int s, int l){
        if(l%s==0){
            return s;
        }

        int max= -1;
        for(int i=1;i<=s/2;i++){
            if(s%i==0){
                if(l%i==0){
                    max= Math.max(i,max);
                }
            }
        }

        return max;
    }
}