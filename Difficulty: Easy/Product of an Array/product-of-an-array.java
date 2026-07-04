/*
     arr[] is the array
*/
class Solution {
    public static long product(long arr[]) {
        // your code here
        long prod = 1;
        for(int i = 0; i < arr.length; i++) {
            prod = (prod * arr[i]) % 1000000007;
        }
        return prod;
    }
}