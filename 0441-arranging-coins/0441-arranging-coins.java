class Solution {
    public int arrangeCoins(int n) {
        int r=0;
        int count=1;
        while(n>=count){
            n-=count;
            r++;
            count++;
        }
        return r;
    }
}