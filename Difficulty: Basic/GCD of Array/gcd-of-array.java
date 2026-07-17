class Solution {
    public int gcd(int n, int arr[]) {

        int min = arr[0];

        for (int num : arr) {
            min = Math.min(min, num);
        }

        int ans = 1;

        for (int i = 1; i <= min; i++) {

            boolean flag = true;

            for (int num : arr) {

                if (num % i != 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                ans = i;
            }
        }

        return ans;
    }
}