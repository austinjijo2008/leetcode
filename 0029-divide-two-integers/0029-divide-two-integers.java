class Solution {
    public int divide(int dividend, int divisor) {
        // Handle edge case for integer overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine the sign of the result
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Convert both to long and take absolute values to prevent overflow
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);

        long quotient = 0;

        while (absDividend >= absDivisor) {
            long temp = absDivisor, multiple = 1;
            
            // Shift divisor left until it's just larger than the remaining dividend
            while (absDividend >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            absDividend -= temp;
            quotient += multiple;
        }

        return negative ? (int)(-quotient) : (int)(quotient);
    }
}