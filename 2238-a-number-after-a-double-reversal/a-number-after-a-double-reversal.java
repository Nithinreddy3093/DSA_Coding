class Solution {
    private int reverse(int num) {
        int a = 0;
        while(num !=0) {
            int ld = num % 10;
            a = a * 10 + ld;
            num = num / 10;
        }
        return a;
    }
    
    public boolean isSameAfterReversals(int num) {
        return num == reverse(reverse(num));
        //the logic
        }
       
    }
