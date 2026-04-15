class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        if(words[startIndex].equals(target)) return 0;
        int n= words.length;
        int r=(startIndex+1)%n;
        int l=(startIndex-1+n)%n;
        int ri=1, li=1;
        while(r!=startIndex){
            if(words[r].equals(target)) return ri;

            r=(r+1)%n;
            ri++;

            if(words[l].equals(target)) return li;

            l=(l-1+n)%n;
            li++;
        }
        return -1;
    }
}