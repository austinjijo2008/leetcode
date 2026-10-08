class Solution {
    public String reverseStr(String s, int k) {
        char ch[] = s.toCharArray();
        int start=0;
        int end=ch.length-1;
        for(start=0;start<end;start+=2*k){
            int i=start;
            int j=Math.min(start+k-1,end);
            while(i<j){
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }
        }
        return new String(ch);
    }
}