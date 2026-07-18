class Solution {

    int n;
    int[] tree;

    public ArrayList<Integer> rangeGcdQueries(int[] arr, int[][] queries) {

        n = arr.length;
        tree = new int[2 * n];

        // Build
        for (int i = 0; i < n; i++)
            tree[n + i] = arr[i];

        for (int i = n - 1; i > 0; i--)
            tree[i] = gcd(tree[i << 1], tree[i << 1 | 1]);

        ArrayList<Integer> ans = new ArrayList<>();

        for (int[] q : queries) {

            if (q[0] == 0) {
                ans.add(query(q[1], q[2]));
            } else {
                update(q[1], q[2]);
            }
        }

        return ans;
    }

    private void update(int pos, int val) {

        pos += n;
        tree[pos] = val;

        while (pos > 1) {
            pos >>= 1;
            tree[pos] = gcd(tree[pos << 1], tree[pos << 1 | 1]);
        }
    }

    private int query(int l, int r) {

        l += n;
        r += n;

        int res = 0;

        while (l <= r) {

            if ((l & 1) == 1)
                res = gcd(res, tree[l++]);

            if ((r & 1) == 0)
                res = gcd(res, tree[r--]);

            l >>= 1;
            r >>= 1;
        }

        return res;
    }

    private int gcd(int a, int b) {

        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }

        return a;
    }
}