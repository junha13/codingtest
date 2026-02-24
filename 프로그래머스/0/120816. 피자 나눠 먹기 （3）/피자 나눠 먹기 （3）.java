class Solution {
    public int solution(int slice, int n) {
        int x = n / slice;
        int y = n % slice;
        if (y == 0) return x;
        return x + 1;
    }
}