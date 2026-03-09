import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int count = 0;
        for (int num : d) {
            if (num <= budget) {
                budget-=num;
                count ++;
            } else {
              return count;
            }
        }
        return count;
    }
}