class Solution {
    static boolean armstrongNumber(int n) {
        // code here
       int temp = n; 
       int sum = 0;
       while(temp > 0) {
           int ld = temp % 10;
           sum = sum + ld * ld * ld;
           temp = temp / 10;
       }
       return n == sum;
       //final answer
}
}