class Solution {
    public String removeOccurrences(String s, String part) {
        return subs(s,part);
    }
    public String subs(String s,String part){
        int index = s.indexOf(part);
        if(index == -1){
            return s;
        }
        return subs(s.substring(0,index) + s.substring(index +part.length(),s.length()),part);
    }
}