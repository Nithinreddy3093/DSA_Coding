class Solution {

    static final long MOD = 1000000007;

    public int minOperations(int[] b) {

        int n = b.length;

        boolean[] visited = new boolean[n];

        long ans = 1;

        for (int i = 0; i < n; i++) {

            if (!visited[i]) {

                int len = 0;
                int curr = i;

                while (!visited[curr]) {
                    visited[curr] = true;
                    curr = b[curr] - 1;   // Convert to 0-based index
                    len++;
                }

                ans = lcm(ans, len) % MOD;
            }
        }

        return (int) (ans % MOD);
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    private long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }
}