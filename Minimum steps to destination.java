class Solution {
    static int minSteps(int d) {
        int ans = (int) Math.ceil(Math.sqrt(2 * d + 0.25) - 0.5), y = 0;
        return ans + ((y = (ans + 2*(d%2)) % 4) == 0 ? 0 : 3 - y);
    }
}
