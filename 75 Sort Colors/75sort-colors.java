class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int c1=0,c2=0,c3=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]==0){
                c1++;
            }
            if(nums[i]==1){
                c2++;
            }
            if(nums[i]==2){
                c3++;
            }
        }
        i=0;
        while(i<nums.length){
            if(i<c1){
                nums[i]=0;
            }
            if(i>=c1 && i<(c1+c2)){
                nums[i]=1;
            }
            if(i>=(c1+c2) && i<c1+c2+c3 ){
                nums[i]=2;
            }
            i++;
        }

    }
}