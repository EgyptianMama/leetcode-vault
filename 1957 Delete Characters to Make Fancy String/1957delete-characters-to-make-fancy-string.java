class Solution {
    public String makeFancyString(String s) {
        if(s.length() <=2 ){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        int count =0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
                if(count < 2){
                    sb.append(s.charAt(i));
                }
            } else {
                sb.append(s.charAt(i));
                count =0;
            }
        }
        return sb.toString();
    }
}