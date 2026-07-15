class Solution {

    public int noOfSol(int b, int p) {

        int count = 0;

        for (int r = 0; r < p; r++) {

            if ((long) r * r % p == 1) {

                if (r == 0) {
                    count += b / p;
                } else if (r <= b) {
                    count += 1 + (b - r) / p;
                }
            }
        }

        return count;
    }
}