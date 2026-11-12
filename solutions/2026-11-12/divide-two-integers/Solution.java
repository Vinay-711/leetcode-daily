class Solution {
    public int divide(int dividend, int divisor) {
        // Handle the special overflow case for Integer.MIN_VALUE / -1.
        // This is the only case where the absolute value of the result (2^31)
        // exceeds Integer.MAX_VALUE (2^31 - 1) and needs special handling.
        // The problem states: "if the quotient is strictly greater than 2^31 - 1,
        // then return 2^31 - 1". For Integer.MIN_VALUE / -1, the mathematical result is 2^31,
        // which is Integer.MAX_VALUE + 1. So, we return Integer.MAX_VALUE.
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine the sign of the result.
        // If signs are different, the result is negative.
        boolean isNegative = (dividend < 0) ^ (divisor < 0);

        // Convert dividend and divisor to long and work with their absolute values.
        // Using long prevents overflow when taking Math.abs(Integer.MIN_VALUE).
        // We make them negative to handle Integer.MIN_VALUE correctly,
        // as its positive counterpart (2^31) cannot be represented in a 32-bit signed int.
        // Working with negative numbers allows the range [-2^63, -1] for long,
        // which is symmetric and avoids the overflow issue of positive 2^31.
        long d = dividend;
        long v = divisor;

        if (d > 0) {
            d = -d;
        }
        if (v > 0) {
            v = -v;
        }

        long quotient = 0;

        // The core division logic using bit shifts (repeated subtraction of powers of 2).
        // Since d and v are negative, d <= v means |d| >= |v|.
        while (d <= v) {
            long tempDivisor = v; // Current multiple of divisor, starting with divisor itself
            long multiple = 1;    // How many times tempDivisor has been subtracted

            // Find the largest multiple of divisor (v * 2^k) that is still "less than or equal" to d.
            // Since d and tempDivisor are negative, "less than or equal" means |d| >= |tempDivisor|.
            // We double tempDivisor (shift left) as long as:
            // 1. d is still "less than or equal" to the doubled tempDivisor.
            //    (d <= (tempDivisor << 1))
            // 2. The doubled tempDivisor does not overflow to a positive number.
            //    ((tempDivisor << 1) < 0) is crucial. If tempDivisor is -2^63 (Long.MIN_VALUE),
            //    tempDivisor << 1 would be 0. We want to stop before it becomes 0 or positive.
            while (d <= (tempDivisor << 1) && (tempDivisor << 1) < 0) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }

            // Subtract the largest found multiple from d and add its count to quotient.
            d -= tempDivisor;
            quotient += multiple;
        }

        // Apply the determined sign to the quotient.
        if (isNegative) {
            quotient = -quotient;
        }

        // The problem statement specifies handling for quotient overflow.
        // If the quotient is strictly greater than 2^31 - 1, return 2^31 - 1.
        // If the quotient is strictly less than -2^31, return -2^31.
        // Note: The special case Integer.MIN_VALUE / -1 already handled returns Integer.MAX_VALUE.
        // This means the `quotient > Integer.MAX_VALUE` check below will not be triggered for that specific case.
        // For other cases, if quotient exceeds int range, it will be capped.
        if (quotient > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (quotient < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int)quotient;
    }
}