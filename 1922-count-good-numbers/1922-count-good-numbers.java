class Solution {
    public static long implementpow(long x, long n) {
        long mod = 1000000000 + 7;
        if (n == 0) {
            return 1;
        }
        long temp = implementpow(x, n / 2);
        temp = temp * temp;
        temp = temp % mod;
        if (n % 2 == 1) {
            temp = temp * x;
            temp = temp % mod;
        }
        return temp;
    }

    public int countGoodNumbers(long n) {
        long m = 1000000000 + 7;
        long n1 = (n / 2 + n % 2);
        long n2 = (n / 2);
        
        return (int) ((implementpow(5, n1) * implementpow(4, n2)) % m);
    }
}