class Solution {
    public String compressedString(String word) {
        int n= word.length();
        StringBuffer comp= new StringBuffer();

        int i=1;
        int start=0;
        while(i<n){
            while(i<n && i-start<10 && i<n && word.charAt(i)==word.charAt(i-1)){
                i++;
            }
            if((i-start)==10) i--;

            comp.append(i-start);
            comp.append(word.charAt(start));

            start=i;
            i++;
            }

            if(start==n-1){
                comp.append(i-start);
                comp.append(word.charAt(start));
            }
            return comp.toString();
        }
    }

    