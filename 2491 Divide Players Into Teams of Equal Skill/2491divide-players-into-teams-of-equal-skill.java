class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
    
        long n=0;
        int temp1=0;
        int l= skill.length-1;
        int temp2= skill[0]+skill[l];
        for(int i=0;i<skill.length/2;i++){
            int j= skill.length-i-1;
            temp1= skill[i]+skill[j];
            if(temp1==temp2){
                n=n+(long)(skill[i]*skill[j]);
            }
            else{
                return -1;
            }
            temp2=skill[i]+skill[j];
        }
        return n;
    }
}