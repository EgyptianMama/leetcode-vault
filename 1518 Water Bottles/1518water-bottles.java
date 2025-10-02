class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;
        while (numBottles >= numExchange) {
            int exchange = numBottles / numExchange;      
            total += exchange;                           
            numBottles = exchange + (numBottles % numExchange); 
        }
        return total;
    }
}
