class Solution {
    public int maximum69Number (int num) {
        int c=0;
        int temp=0;

        String numStr = String.valueOf(num); // convert number to String
        int[] n = new int[numStr.length()];
        
        for (int i = 0; i < numStr.length(); i++) {
            n[i] = numStr.charAt(i) - '0'; // convert each char to int
        }
         for(int i=0;i<n.length; i++){
            if(n[i]==6){
                n[i]=9;
                break;
            }
        }
        int ans=0;
        for(int i=0;i<n.length;i++){
            ans= ans*10+n[i];
        }
        return ans;
    }
}