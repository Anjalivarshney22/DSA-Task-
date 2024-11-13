
public class Solution {
    public int mySqrt(int N) {
    if (N == 0) return 0;

        long x = N;
        long y = (x + 1) / 2; 

        while (y < x) {
            x = y;
            y = (x + N / x) / 2;
        }

        return (int) x;
    }
} 