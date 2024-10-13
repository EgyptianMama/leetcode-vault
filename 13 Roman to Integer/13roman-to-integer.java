class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> Roman= new HashMap<>();
        int n= s.length();
        int sum=0;
        Roman.put('I',1);
        Roman.put('V',5);
        Roman.put('X',10);
        Roman.put('L',50);
        Roman.put('C',100);
        Roman.put('D',500);
        Roman.put('M',1000);

        for(int i=0;i<n;i++){
            int c= Roman.get(s.charAt(i));

            if(i<n-1 && c< Roman.get(s.charAt(i+1))){
                sum= sum- c;
            }
            else{
                sum = sum+c;
            }
        }

        return sum;
    }
}