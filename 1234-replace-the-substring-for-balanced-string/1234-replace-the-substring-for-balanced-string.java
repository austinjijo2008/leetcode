class Solution {
    public int balancedString(String s) {
        int n = s.length();
        int k = n / 4;
        int[] count = new int[128];
        

        for (int i = 0; i < n; i++) {
            count[s.charAt(i)]++;
        }
        
        
        if (count['Q'] <= k && count['W'] <= k && count['E'] <= k && count['R'] <= k) {
            return 0;
        }
        
        int minLen = n;
        int left = 0;
        
 
        for (int right = 0; right < n; right++) {

            count[s.charAt(right)]--;
            

            while (left < n && count['Q'] <= k && count['W'] <= k && count['E'] <= k && count['R'] <= k) {
                minLen = Math.min(minLen, right - left + 1);

                count[s.charAt(left)]++;
                left++;
            }
        }
        
        return minLen;
    }
}