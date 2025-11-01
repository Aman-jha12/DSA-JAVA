class Solution {
    public double myPow(double x, int n) {
        // convert n to long to handle Integer.MIN_VALUE
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double result = 1.0;
        while (N > 0) {
            if (N % 2 == 1) {  // if n is odd
                result *= x;
            }
            x *= x;  // square the base
            N /= 2;  // divide exponent by 2
        }

        return result;
    }
}
