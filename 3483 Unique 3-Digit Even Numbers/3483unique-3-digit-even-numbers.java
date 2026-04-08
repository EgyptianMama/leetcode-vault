class Solution {
    public int totalNumbers(int[] digits) {
        int[] map= new int[10];
        for(int i=0;i<digits.length;i++){
            map[digits[i]]++;
        }
        int ans=0;
        for(int i=1; i<=9;i++){
            if(map[i]==0) continue;
            map[i]--;
            for(int j=0;j<=9;j++){
                if(map[j]==0) continue;
                map[j]--;
                for(int k=0;k<=8;k+=2){
                    if(map[k]==0) continue;
                    map[k]--;
                    ans=ans+1;
                    map[k]++;
                }
                map[j]++;
            }
            map[i]++;
        }
        return ans;
    }
}