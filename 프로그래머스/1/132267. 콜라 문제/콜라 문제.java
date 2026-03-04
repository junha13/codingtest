class Solution {
    public int solution(int a, int b, int n) {
        int count = 0, result = 0;
        while (true) {
            count = (n / a) * b;
            n = n%a + count;

            result += count;
            if (n/a <= 0) break;;
        }
        return result;
    }
}