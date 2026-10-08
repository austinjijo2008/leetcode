class Solution {
    public int titleToNumber(String columnTitle) {
        int r=0;
        for(int i=0;i<columnTitle.length();i++){
            char c=columnTitle.charAt(i);
            int v=c-'A'+1;
            r=r*26+v;
        }
        return r;
    }
}