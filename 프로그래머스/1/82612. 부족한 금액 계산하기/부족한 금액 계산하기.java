class Solution {
    public long solution(int price, int money, int count) {
        long totalCnt = 0;
        for(int i=1; i<=count; i++) {
            totalCnt += ((long) i * price);
        }
        return money - totalCnt >= 0 ? 0 : totalCnt - money;
    }
}