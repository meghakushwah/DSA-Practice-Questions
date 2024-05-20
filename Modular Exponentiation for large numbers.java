class Solution
{
    public long PowMod(long base, long power, long m)
    {
        // Code here
        long ans = 1;
        while (power > 0) {
            if ((power & 1) == 1) {
                ans *= base;
            }
            base *= base;
            base %= m;
            power = power >> 1;
            ans=ans%m;
        }
        return ans;
        
    }
}
