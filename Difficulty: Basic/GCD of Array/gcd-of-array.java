class Solution {

    public int gcd(int n, int arr[]) {

        int ans = arr[0];

        for (int i = 1; i < n; i++) {
            ans = findGcd(ans, arr[i]);
        }

        return ans;
    }

    private int findGcd(int a, int b) {

        while (b != 0) {

            int temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }
}