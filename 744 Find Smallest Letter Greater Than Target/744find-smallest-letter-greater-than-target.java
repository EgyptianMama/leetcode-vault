class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0,mid=0, end=letters.length-1;
        if(letters[0]>target) return letters[0];
        while(start<=end){
            mid = start +(end-start)/2;
            if(letters[mid]<target) start= mid+1;
            else if(letters[mid]>target) {
                if(letters[mid-1]<= target){
                    return letters[mid];
                }
                end= mid-1;
            }
            else start= start+1;
        }
        return letters[0];

    }
}