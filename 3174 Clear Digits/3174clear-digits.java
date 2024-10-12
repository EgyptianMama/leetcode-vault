class Solution {
    public String clearDigits(String s) {
        StringBuilder a = new StringBuilder();
        int i;
        for(i=0; i<s.length(); i++)
        {
            if(s.charAt(i)>='0'&&s.charAt(i)<='9')
            {
                a.deleteCharAt(a.length()-1);
            }
            else
            {
                a.append(s.charAt(i));
            }
        }
        return a.toString();
    }
}