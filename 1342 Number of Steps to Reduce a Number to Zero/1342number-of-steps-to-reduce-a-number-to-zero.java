class Solution {
    int c= 0;
    public int numberOfSteps(int num) {
        if(num==0){
            return c;
        }
        if(num%2==0){
            c++;
            numberOfSteps(num/2);
       }
       else{
        c++;
         numberOfSteps(num-1);
       }
       return c;
    }
}
