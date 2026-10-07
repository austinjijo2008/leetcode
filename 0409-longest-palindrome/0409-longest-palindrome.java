class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);

        }
        int l=0;
        boolean odd=false;
        for(char c:map.keySet()){
            if(map.get(c)%2==0){
                l+=map.get(c);
            }
            else{
                l+=(map.get(c)-1);
                odd=true;
            }
        }
        if(odd){
            l++;
        }
        return l;

    }
}