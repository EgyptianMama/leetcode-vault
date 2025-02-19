class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> rmp= new HashMap<>();
        HashMap<Character,Integer> mmp= new HashMap<>();
        
        for(char c: ransomNote.toCharArray()){
            rmp.put(c,rmp.getOrDefault(c,0)+1);
        }
        
        for(char c: magazine.toCharArray()){
            mmp.put(c,mmp.getOrDefault(c,0)+1);
        }

        for(char c:rmp.keySet()){
            if(mmp.getOrDefault(c,0)<rmp.get(c)){
                return false;
            }
        }

        return true;
    }
}