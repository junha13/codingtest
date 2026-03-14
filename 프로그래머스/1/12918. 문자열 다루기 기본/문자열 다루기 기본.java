class Solution {
    public boolean solution(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.length() != 4 && s.length() != 6) {
                return false;
            }
            
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}