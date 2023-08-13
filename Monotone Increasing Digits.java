class Solution {
    public int monotoneIncreasingDigits(int n) {
        int tmpNum = n, i = 1;
        while (tmpNum > 0) {
            i *= 10;
            int mod = tmpNum % 10;
            tmpNum /= 10;
            if (mod < tmpNum % 10) {
                break;
            }
        }
        if (tmpNum > 0) {
            return monotoneIncreasingDigits((tmpNum * i) - 1);
        }
        return n;
    }
}
