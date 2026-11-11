class Solution {
    public int findNthDigit(int n) {
        long len = 1;
        long count = 9;
        long start = 1;

        // 1. Find the range where the nth digit belongs
        while (n > len * count) {
            n -= len * count;
            len++;
            count *= 10;
            start *= 10;
        }

        // 2. Find the exact number containing the nth digit
        start += (n - 1) / len;
        
        // 3. Find the specific digit within the number
        String s = Long.toString(start);
        return Character.getNumericValue(s.charAt((int)((n - 1) % len)));
    
    }
}