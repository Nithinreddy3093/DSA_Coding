class Solution {

    public int[] gcdValues(int[] nums, long[] queries) {

        int max = 0;
        for (int x : nums) {
            max = Math.max(max, x);
        }

        int[] freq = new int[max + 1];

        for (int x : nums) {
            freq[x]++;
        }

        long[] exact = new long[max + 1];

        for (int d = max; d >= 1; d--) {

            long count = 0;

            for (int multiple = d; multiple <= max; multiple += d) {
                count += freq[multiple];
            }

            exact[d] = count * (count - 1) / 2;

            for (int multiple = d * 2; multiple <= max; multiple += d) {
                exact[d] -= exact[multiple];
            }
        }

        // Reuse exact[] as prefix[] to save memory.
        for (int i = 1; i <= max; i++) {
            exact[i] += exact[i - 1];
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            long target = queries[i] + 1;

            int left = 1;
            int right = max;

            while (left < right) {

                int mid = left + (right - left) / 2;

                if (exact[mid] >= target) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }

            ans[i] = left;
        }

        return ans;
    }
}