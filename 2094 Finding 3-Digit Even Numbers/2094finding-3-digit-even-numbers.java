class Solution {
    public int[] findEvenNumbers(int[] digits) {
        List<Integer> result= new ArrayList<>();
        int[] map= new int[10];
        for(int i=0;i<digits.length;i++){
            map[digits[i]]++;
        }

        for(int i=1; i<=9;i++){
            if(map[i]==0) continue;
            map[i]--;
            for(int j=0;j<=9;j++){
                if(map[j]==0) continue;
                map[j]--;
                for(int k=0;k<=8;k+=2){
                    if(map[k]==0) continue;
                    map[k]--;
                    int sum= i*100 + j*10 + k;
                    result.add(sum);
                    map[k]++;
                }
                map[j]++;
            }
            map[i]++;
        }
        int[] ans = result.stream().mapToInt(i -> i).toArray();
        return ans;
    }
}