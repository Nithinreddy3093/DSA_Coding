class Solution {
    public boolean isPalindrome(int n) {

        n = Math.abs(n);

        String s = String.valueOf(n);

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }
}