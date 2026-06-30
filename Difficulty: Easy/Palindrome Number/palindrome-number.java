class Solution {
    private int reverse(int x) {
        int a = 0;
        while(x!=0){
            int ld = x % 10;
            a = a * 10 + ld;
            x = x / 10;
        }
        return a;
    }
    public boolean isPalindrome(int x) {
        // code here
        
        return x == reverse(x);
        
    }
}