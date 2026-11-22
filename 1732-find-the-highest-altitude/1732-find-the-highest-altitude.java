class Solution {
    public int largestAltitude(int[] gain) {
        int ca=0;
        int ma=0;
        for(int g:gain){
            ca+=g;
            if(ca>ma){
                ma=ca;
            }
        }
        return ma;
    }
}