class Solution {
    public int solution(int n) {
        long firstNum = 0, secondNum = 1;
        long x=0;
        for (int i=2; i<=n; i++) {
            x = (firstNum + secondNum) % 1234567;
            firstNum = secondNum % 1234567;
            secondNum = x % 1234567;
        }

        return (int) x;
    }
}