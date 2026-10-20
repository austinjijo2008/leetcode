class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int td=numBottles;
        int eb=numBottles;
        while(eb>=numExchange){
            int nb=eb/numExchange;
            td+=nb;
            eb=nb+(eb%numExchange);
        }
        return td;
    }
}