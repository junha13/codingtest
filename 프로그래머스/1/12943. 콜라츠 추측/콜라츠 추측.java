class Solution {
    public int solution(int num) {
        long convetNum = num;
        int count = 0;

        while (convetNum != 1) {
            if (convetNum % 2 == 0) convetNum /= 2;
            else convetNum = convetNum * 3 + 1;
            count++;
            if (count >= 500) {
                count = -1;
                break;
            }
        }
        return count;
    }
}