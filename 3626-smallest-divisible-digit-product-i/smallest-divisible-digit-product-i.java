class Solution {
    public int smallestNumber(int n, int t) {

        int temp = n;
        int p = 1;

        while (temp > 0) {
            int re = temp % 10;
            p *= re;
            if (p % t == 0
            ) {
            return n;
        }
            temp /= 10;
        }

        return smallestNumber(n + 1, t);
    }
}