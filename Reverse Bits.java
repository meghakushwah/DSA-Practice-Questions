class Solution {
    static long reversedBits(long x) {
        long reversed = 0;
        for (int i = 0; i < 32; i++) {
            reversed = (reversed << 1) | (x & 1);
            x >>= 1;
        }
        return reversed;
    }
}
