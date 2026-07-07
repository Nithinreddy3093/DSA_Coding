class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        String temp = s.trim();
        for(int i = temp.length () - 1; i >= 0; i--) {
            if(temp.charAt(i) == ' ') {
                break;
            }
            count++;
        }
        return count;
    }
}