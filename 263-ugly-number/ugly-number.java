class Solution {
    public boolean isUgly(int n) {
        // edge cases
        if(n <=0){
            return false;
        }
        //step 1 : remove all 2's ni check chestam and remove cheyali
        while(n %2 == 0) {
            n = n / 2;
        }
        // step 2 : all 3's ni ni check chestam remove cheyali
        while(n % 3 == 0) {
            n = n / 3;
        }
        // step 3 : all 5's ni check chestam and remove cheyali 
        while(n % 5 == 0) {
            n = n / 5;
        }
        return n == 1;
    }
}