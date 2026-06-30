class Solution {
    public int reverseDigits(int n) {
        // Code here
        int a= 0;
        while(n != 0){
        int ld = n % 10;
        a = a * 10 + ld;
        n = n /10;
        }
         return a;
    }
   
}