class Solution {
    public int solution(int[] a, int[] b) {
        int result = 0;
        for (int i=0; i<=a.length-1; i++) {
            result += a[i] * b[i];
        }
        return result;
    }
}